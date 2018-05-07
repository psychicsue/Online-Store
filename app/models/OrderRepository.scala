package models

import java.sql.Date
import javax.inject.{Inject, Singleton}

import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}
/**
*
* @author Zu
*
* 2018-05-07
*/
@Singleton
class OrderRepository @Inject()(dbConfigProvider: DatabaseConfigProvider,val basketRepository: BasketRepository)(implicit ec: ExecutionContext) {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._


  class OrderTable(tag: Tag) extends Table[Order](tag, "order") {

    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def basket = column[Int]("basket")

    def date = column[Int]("date")

    def address = column[String]("address")


    def * = (id, basket, date, address) <> ((Order.apply _).tupled, Order.unapply)
  }

  import basketRepository.BasketTable

  val order = TableQuery[OrderTable]

  def create(id: Long, basket: Int, date: Int, address: String): Future[Int] =
    db.run(order += Order(id, basket, date, address))

  def list(): Future[Seq[Order]] = db.run {
    order.result
  }
}
