package models

import javax.inject.{Inject, Singleton}

import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class OpinionRepository @Inject()(dbConfigProvider: DatabaseConfigProvider,val productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  import productRepository.ProductTable

  private val product_id = TableQuery[ProductTable]

  class OpinionTable(tag: Tag) extends Table[Opinion](tag, "opinion") {

    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def product = column[Long]("product")

    def opinion = column[String]("opinion")

    def product_fk = foreignKey("prod_fk",product, product_id)(_.id)

    def * = (id, product, opinion) <> ((Opinion.apply _).tupled, Opinion.unapply)
  }

  val opinions = TableQuery[OpinionTable]

  def create(id: Long, product: Long, opinion: String): Future[Int] =
    db.run(opinions += Opinion(id, product, opinion))

  def list(): Future[Seq[Opinion]] = db.run {
    opinions.result
  }
}
