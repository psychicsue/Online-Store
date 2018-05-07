package models

import java.util.Date

import play.api.libs.json._

case class Order(id: Long, basket: Int, date: Int, address: String)

object Order {
  implicit val orderFormat = Json.format[Order]
}
