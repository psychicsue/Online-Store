
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateProductForm],Seq[Category],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm],category: Seq[Category])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.101*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Products")/*9.18*/ {_display_(Seq[Any](format.raw/*9.20*/("""
  """),_display_(/*10.4*/form(routes.ProductController.addProduct())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(product("name"))),format.raw/*11.30*/("""
		"""),_display_(/*12.4*/inputText(product("description"))),format.raw/*12.37*/("""

	  """),format.raw/*14.4*/("""<select name="category" id="category">
		"""),_display_(/*15.4*/for(cat <- category) yield /*15.24*/{_display_(Seq[Any](format.raw/*15.25*/("""
			"""),format.raw/*16.4*/("""<option value=""""),_display_(/*16.20*/cat/*16.23*/.id),format.raw/*16.26*/("""">"""),_display_(/*16.29*/cat/*16.32*/.name),format.raw/*16.37*/("""</option>
		""")))}),format.raw/*17.4*/("""
	  """),format.raw/*18.4*/("""</select>


		"""),_display_(/*21.4*/CSRF/*21.8*/.formField),format.raw/*21.18*/("""

		"""),format.raw/*23.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>
	""")))}),format.raw/*26.3*/("""
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(product:Form[CreateProductForm],category:Seq[Category],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,category)(request)

  def f:((Form[CreateProductForm],Seq[Category]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,category) => (request) => apply(product,category)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 28 22:04:21 CEST 2018
                  SOURCE: D:/e-business/play-products-crud-slick/app/views/index.scala.html
                  HASH: 3de76f4e8ec17ddb7d988466ccdfc5470e147436
                  MATRIX: 782->1|954->105|1000->100|1030->122|1058->125|1072->132|1105->157|1151->166|1182->172|1197->179|1231->193|1263->196|1293->201|1317->217|1356->219|1387->224|1439->267|1479->269|1510->274|1557->300|1588->305|1642->338|1676->345|1745->388|1781->408|1820->409|1852->414|1895->430|1907->433|1931->436|1961->439|1973->442|1999->447|2043->461|2075->466|2119->484|2131->488|2162->498|2195->504|2307->586|2340->589
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|37->12|37->12|39->14|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|41->16|41->16|42->17|43->18|46->21|46->21|46->21|48->23|51->26|52->27
                  -- GENERATED --
              */
          