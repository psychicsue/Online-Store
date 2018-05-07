package models

import play.api.libs.json._

case class Basket(id: Int, product: Long, amount: Int)

object Basket {
  implicit val basketFormat = Json.format[Basket]
}
