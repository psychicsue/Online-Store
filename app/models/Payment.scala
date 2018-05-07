package models

import play.api.libs.json._

case class Payment(id: Long, name: String, description: String, category: Int)

object Payment {
  implicit val paymentFormat = Json.format[Payment]
}
