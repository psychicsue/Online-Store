
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

object key extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateKeywordForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(key: Form[CreateKeywordForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Keys")/*9.14*/ {_display_(Seq[Any](format.raw/*9.16*/("""
  """),_display_(/*10.4*/form(routes.KeywordController.addKeyword())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(key("id"))),format.raw/*11.24*/("""
		"""),_display_(/*12.4*/inputText(key("value"))),format.raw/*12.27*/("""

		"""),_display_(/*14.4*/CSRF/*14.8*/.formField),format.raw/*14.18*/("""

		"""),format.raw/*16.3*/("""<div class="buttons">
			<input type="submit" value="Add keyword"/>
		</div>
	""")))}),format.raw/*19.3*/("""
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(key:Form[CreateKeywordForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(key)(request)

  def f:((Form[CreateKeywordForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (key) => (request) => apply(key)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 22:04:21 CEST 2018
                  SOURCE: D:/e-business/play-products-crud-slick/app/views/key.scala.html
                  HASH: 96fa0a18a789a103b0ba2d2a8d1a494b627ca058
                  MATRIX: 766->1|910->77|955->72|985->94|1013->97|1027->104|1060->129|1106->138|1137->144|1152->151|1186->165|1218->168|1248->173|1268->185|1307->187|1338->192|1390->235|1430->237|1461->242|1502->262|1533->267|1577->290|1610->297|1622->301|1653->311|1686->317|1798->399|1831->402
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|37->12|37->12|39->14|39->14|39->14|41->16|44->19|45->20
                  -- GENERATED --
              */
          