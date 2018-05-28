
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

object opinion extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateOpinionForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opinion: Form[CreateOpinionForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.77*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Opinion")/*9.17*/ {_display_(Seq[Any](format.raw/*9.19*/("""
  """),_display_(/*10.4*/form(routes.OpinionController.addOpinion())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(opinion("id"))),format.raw/*11.28*/("""
		"""),_display_(/*12.4*/inputText(opinion("product"))),format.raw/*12.33*/("""
		"""),_display_(/*13.4*/inputText(opinion("opinion"))),format.raw/*13.33*/("""

		"""),_display_(/*15.4*/CSRF/*15.8*/.formField),format.raw/*15.18*/("""

		"""),format.raw/*17.3*/("""<div class="buttons">
			<input type="submit" value="Add Opinion"/>
		</div>
	""")))}),format.raw/*20.3*/("""
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(opinion:Form[CreateOpinionForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(opinion)(request)

  def f:((Form[CreateOpinionForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (opinion) => (request) => apply(opinion)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 22:04:21 CEST 2018
                  SOURCE: D:/e-business/play-products-crud-slick/app/views/opinion.scala.html
                  HASH: 02dbc8fa0719748940e4c0d074db0707af3b3faa
                  MATRIX: 770->1|918->81|963->76|993->98|1021->101|1035->108|1068->133|1114->142|1145->148|1160->155|1194->169|1226->172|1256->177|1279->192|1318->194|1349->199|1401->242|1441->244|1472->249|1517->273|1548->278|1598->307|1629->312|1679->341|1712->348|1724->352|1755->362|1788->368|1900->450|1933->453
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|37->12|37->12|38->13|38->13|40->15|40->15|40->15|42->17|45->20|46->21
                  -- GENERATED --
              */
          