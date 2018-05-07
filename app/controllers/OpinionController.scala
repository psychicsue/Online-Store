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

class OpinionController @Inject()(opinionRepository: OpinionRepository,
                                  cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val opinionForm: Form[CreateOpinionForm] = Form {
    mapping(
      "id" -> longNumber,
      "product" -> longNumber,
      "opinion" -> nonEmptyText,
    )(CreateOpinionForm.apply)(CreateOpinionForm.unapply)
  }

  def index = Action.async { implicit request =>
    val op = opinionRepository.list()
    op.map(op => Ok(views.html.opinion(opinionForm)))
  }

  def addOpinion = Action { implicit request =>
    opinionForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.opinion(formWithErrors))
      },
      opinion => {
        val opinionID = opinionRepository.create(opinion.id, opinion.product, opinion.opinion)
        Redirect(routes.OpinionController.getOpinion()).flashing("success" -> "Opinion saved!")
      }
    )
  }

  def getOpinion = Action.async { implicit request =>
    opinionRepository.list().map { opinion =>
      Ok(Json.toJson(opinion))
    }
  }
}

case class CreateOpinionForm(id: Long, product: Long, opinion: String)
