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

class CategoryController @Inject()(categoryRepository: CategoryRepository,
                                  cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val categoryForm: Form[CreateCategoryForm] = Form {
    mapping(
      "name" -> nonEmptyText,
    )(CreateCategoryForm.apply)(CreateCategoryForm.unapply)
  }

  def index = Action.async { implicit request =>
    val categories = categoryRepository.list()
    categories.map(cat => Ok(views.html.category(categoryForm)))
  }

  def addCategory = Action { implicit request =>
    categoryForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.category(formWithErrors))
      },
      category => {
        val categoryId = categoryRepository.create(category.name)
        Redirect(routes.CategoryController.getCategories()).flashing("success" -> "Category saved!")
      }
    )
  }

  def getCategories = Action.async { implicit request =>
    categoryRepository.list().map { category =>
      Ok(Json.toJson(category))
    }
  }
}

case class CreateCategoryForm(name: String)
