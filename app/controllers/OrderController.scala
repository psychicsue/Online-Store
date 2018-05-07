package controllers

import java.sql.Date
import javax.inject._

import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class OrderController @Inject()(orderRepository: OrderRepository,
                                  cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val orderForm: Form[CreateOrderForm] = Form {
    mapping(
      "id" -> longNumber,
      "basket" -> number,
      "date" -> number,
      "address" -> nonEmptyText,
    )(CreateOrderForm.apply)(CreateOrderForm.unapply)
  }

  def index = Action.async { implicit request =>
    val order = orderRepository.list()
    order.map(bask => Ok(views.html.order(orderForm)))
  }

  def orderProducts = Action { implicit request =>
    orderForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.order(formWithErrors))
      },
      order => {
        val orderId = orderRepository.create(order.id, order.basket, order.date, order.address)
        Redirect(routes.OrderController.getOrder()).flashing("success" -> "Products Ordered")
      }
    )
  }

  def getOrder = Action.async { implicit request =>
    orderRepository.list().map { order =>
      Ok(Json.toJson(order))
    }
  }
}

case class CreateOrderForm(id: Long, basket: Int, date: Int, address: String)
