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

class BasketController @Inject()(basketRepository: BasketRepository,
                                  cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val basketForm: Form[CreateBasketForm] = Form {
    mapping(
      "id" -> number,
      "product" -> longNumber,
      "amount" -> number,
    )(CreateBasketForm.apply)(CreateBasketForm.unapply)
  }

  def index = Action.async { implicit request =>
    val basket = basketRepository.list()
    basket.map(bask => Ok(views.html.basket(basketForm)))
  }

  def addProductToBasket = Action { implicit request =>
    basketForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.basket(formWithErrors))
      },
      basket => {
        val basketId = basketRepository.create(basket.id, basket.product, basket.amount)
        Redirect(routes.BasketController.getProductsFromBasket()).flashing("success" -> "Basket saved!")
      }
    )
  }

  def getProductsFromBasket = Action.async { implicit request =>
    basketRepository.list().map { basket =>
      Ok(Json.toJson(basket))
    }
  }
}

case class CreateBasketForm(id:Int, product: Long, amount: Int)
