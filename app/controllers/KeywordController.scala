package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class KeywordController @Inject()(keywordRepository: KeywordRepository,
                                  cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val keywordForm: Form[CreateKeywordForm] = Form {
    mapping(
      "id" -> longNumber,
      "value" -> nonEmptyText,
    )(CreateKeywordForm.apply)(CreateKeywordForm.unapply)
  }

  def index = Action.async { implicit request =>
    val keys = keywordRepository.list()
    keys.map(keys => Ok(views.html.key(keywordForm)))
  }

  def addKeyword = Action { implicit request =>
    keywordForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.key(formWithErrors))
      },
      key => {
        val keyId = keywordRepository.create(key.id, key.value)
        Redirect(routes.KeywordController.getKeyword()).flashing("success" -> "Keyword saved!")
      }
    )
  }

  def getKeyword = Action.async { implicit request =>
    keywordRepository.list().map { key =>
      Ok(Json.toJson(key))
    }
  }
}

case class CreateKeywordForm(id: Long, value: String)
