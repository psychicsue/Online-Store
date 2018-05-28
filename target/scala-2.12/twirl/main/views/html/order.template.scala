
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object order extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateOrderForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(order: Form[CreateOrderForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Opinion")/*9.17*/ {_display_(Seq[Any](format.raw/*9.19*/("""
  """),_display_(/*10.4*/form(routes.OrderController.orderProducts())/*10.48*/ {_display_(Seq[Any](format.raw/*10.50*/("""
		"""),_display_(/*11.4*/inputText(order("id"))),format.raw/*11.26*/("""
		"""),_display_(/*12.4*/inputText(order("basket"))),format.raw/*12.30*/("""
		"""),_display_(/*13.4*/inputText(order("date"))),format.raw/*13.28*/("""
		"""),_display_(/*14.4*/inputText(order("address"))),format.raw/*14.31*/("""

		"""),_display_(/*16.4*/CSRF/*16.8*/.formField),format.raw/*16.18*/("""

		"""),format.raw/*18.3*/("""<div class="buttons">
			<input type="submit" value="Add Order"/>
		</div>
	""")))}),format.raw/*21.3*/("""
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(order:Form[CreateOrderForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(order)(request)

  def f:((Form[CreateOrderForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (order) => (request) => apply(order)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 22:04:21 CEST 2018
                  SOURCE: D:/e-business/play-products-crud-slick/app/views/order.scala.html
                  HASH: 99894dd352dc83b1cf04f73066f0af7bbd9fdee0
                  MATRIX: 766->1|910->77|955->72|985->94|1013->97|1027->104|1060->129|1106->138|1137->144|1152->151|1186->165|1218->168|1248->173|1271->188|1310->190|1341->195|1394->239|1434->241|1465->246|1508->268|1539->273|1586->299|1617->304|1662->328|1693->333|1741->360|1774->367|1786->371|1817->381|1850->387|1960->467|1993->470
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|37->12|37->12|38->13|38->13|39->14|39->14|41->16|41->16|41->16|43->18|46->21|47->22
                  -- GENERATED --
              */
          