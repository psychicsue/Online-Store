
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateBasketForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(basketProduct: Form[CreateBasketForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.82*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Basket")/*9.16*/ {_display_(Seq[Any](format.raw/*9.18*/("""
  """),_display_(/*10.4*/form(routes.BasketController.addProductToBasket())/*10.54*/ {_display_(Seq[Any](format.raw/*10.56*/("""
		"""),_display_(/*11.4*/inputText(basketProduct("id"))),format.raw/*11.34*/("""
		"""),_display_(/*12.4*/inputText(basketProduct("product"))),format.raw/*12.39*/("""
		"""),_display_(/*13.4*/inputText(basketProduct("amount"))),format.raw/*13.38*/("""

		"""),_display_(/*15.4*/CSRF/*15.8*/.formField),format.raw/*15.18*/("""

		"""),format.raw/*17.3*/("""<div class="buttons">
			<input type="submit" value="Add To Basket"/>
		</div>
	""")))}),format.raw/*20.3*/("""
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(basketProduct:Form[CreateBasketForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(basketProduct)(request)

  def f:((Form[CreateBasketForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (basketProduct) => (request) => apply(basketProduct)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 22:27:19 CEST 2018
                  SOURCE: D:/e-business/play-products-crud-slick/app/views/basket.scala.html
                  HASH: 55b35830a7474105cdf59eb74aa5d75bde806341
                  MATRIX: 768->1|921->86|966->81|996->103|1024->106|1038->113|1071->138|1117->147|1148->153|1163->160|1197->174|1229->177|1259->182|1281->196|1320->198|1351->203|1410->253|1450->255|1481->260|1532->290|1563->295|1619->330|1650->335|1705->369|1738->376|1750->380|1781->390|1814->396|1928->480|1961->483
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|37->12|37->12|38->13|38->13|40->15|40->15|40->15|42->17|45->20|46->21
                  -- GENERATED --
              */
          