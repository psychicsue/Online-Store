
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

	"""),format.raw/*9.2*/("""ReactDOM.render(
	<h1>Hello, world!</h1>,
	document.getElementById('root')
	);

"""),_display_(/*14.2*/main("Products")/*14.18*/ {_display_(Seq[Any](format.raw/*14.20*/("""
  """),_display_(/*15.4*/form(routes.ProductController.addProduct())/*15.47*/ {_display_(Seq[Any](format.raw/*15.49*/("""
		"""),_display_(/*16.4*/inputText(product("name"))),format.raw/*16.30*/("""
		"""),_display_(/*17.4*/inputText(product("description"))),format.raw/*17.37*/("""

	  """),format.raw/*19.4*/("""<select name="category" id="category">
		"""),_display_(/*20.4*/for(cat <- category) yield /*20.24*/{_display_(Seq[Any](format.raw/*20.25*/("""
			"""),format.raw/*21.4*/("""<option value=""""),_display_(/*21.20*/cat/*21.23*/.id),format.raw/*21.26*/("""">"""),_display_(/*21.29*/cat/*21.32*/.name),format.raw/*21.37*/("""</option>
		""")))}),format.raw/*22.4*/("""
	  """),format.raw/*23.4*/("""</select>


		"""),_display_(/*26.4*/CSRF/*26.8*/.formField),format.raw/*26.18*/("""

		"""),format.raw/*28.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>
	""")))}),format.raw/*31.3*/("""
""")))}),format.raw/*32.2*/("""
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
                  DATE: Mon May 28 22:27:19 CEST 2018
                  SOURCE: D:/e-business/play-products-crud-slick/app/views/index.scala.html
                  HASH: de4b8cd76c89e71afdc5e86b7cb76ec0daeb4e0c
                  MATRIX: 782->1|954->105|1000->100|1030->122|1058->125|1072->132|1105->157|1151->166|1182->172|1197->179|1231->193|1263->196|1294->201|1406->287|1431->303|1471->305|1502->310|1554->353|1594->355|1625->360|1672->386|1703->391|1757->424|1791->431|1860->474|1896->494|1935->495|1967->500|2010->516|2022->519|2046->522|2076->525|2088->528|2114->533|2158->547|2190->552|2234->570|2246->574|2277->584|2310->590|2422->672|2455->675
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|34->9|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|42->17|42->17|44->19|45->20|45->20|45->20|46->21|46->21|46->21|46->21|46->21|46->21|46->21|47->22|48->23|51->26|51->26|51->26|53->28|56->31|57->32
                  -- GENERATED --
              */
          