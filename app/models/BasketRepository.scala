package models

import javax.inject.{Inject, Singleton}

import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class BasketRepository @Inject()(dbConfigProvider: DatabaseConfigProvider,
                                 productRepository: ProductRepository)(implicit ec: ExecutionContext) {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  import productRepository.ProductTable

  private val product_id = TableQuery[ProductTable]

  private class BasketTable(tag: Tag) extends Table[Basket](tag, "basket") {

    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    def product = column[Long]("product")

    def amount = column[Int]("amount")

    def product_fk = foreignKey("product_fk", product, product_id)(_.id)

    def * = (id, product, amount) <> ((Basket.apply _).tupled, Basket.unapply)
  }


  private val basketProduct = TableQuery[BasketTable]

  def create(id: Int, product: Long, amount: Int): Future[Int] =
    db.run(basketProduct += Basket(id, product, amount))


  def list(): Future[Seq[Basket]] = db.run {
    basketProduct.result
  }
}
