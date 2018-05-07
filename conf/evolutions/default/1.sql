# --- !Ups

create table "category" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null
);

create table "product" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null,
  "description" text not null,
  category int not null,
  foreign key(category) references category(id)
);

create table "basket" (
  "id" integer not null primary key autoincrement,
  "product" varchar not null,
  "amount" int DEFAULT 1 not null,
  foreign key(product) references product(id)
);

create table "keyword" (
  "id" integer not null primary key autoincrement,
  "value" varchar not null
);

create table "opinion" (
  "id" integer not null primary key autoincrement,
  "product" long not null,
  "opinion" varchar not null,
  foreign key(product) references product(id)
);


create table "order" (
  "id" integer not null primary key autoincrement,
  "basket" int not null,
  "date" varchar not null,
  "address" varchar not null,
);


# --- !Downs

drop table "product" if exists;
drop table "category" if exists;
drop table "basket" if exists;
drop table "keyword" if exists;
drop table "opinion" if exists;
drop table "order" if exists;
