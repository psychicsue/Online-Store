package models

import play.api.libs.json._
/**
*
* @author Zu 
*
* 2018-05-07
*/
case class Keyword(id: Long, value: String)

object Keyword {
  implicit val keywordFormat = Json.format[Keyword]
}
