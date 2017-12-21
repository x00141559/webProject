
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object product extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Product,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: models.Product, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main("Product", user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
	"""),_display_(/*4.3*/if(p != null)/*4.16*/ {_display_(Seq[Any](format.raw/*4.18*/("""
			"""),format.raw/*5.4*/("""<div class="container-fluid">
				<!---Start Rachel -->
				<div class="product-container">
					<h2>"""),_display_(/*8.11*/p/*8.12*/.getName),format.raw/*8.20*/("""</h2>
						<div class="product-description">
							"""),_display_(/*10.9*/p/*10.10*/.getDescription),format.raw/*10.25*/("""
						"""),format.raw/*11.7*/("""</div>
				<div class="addtocart">
					&euro; """),_display_(/*13.14*/("%.2f".format(p.getPrice))),format.raw/*13.41*/(""" """),format.raw/*13.42*/("""&nbsp;
				<a class="btn btn-success" href=""""),_display_(/*14.39*/routes/*14.45*/.HomeController.purchase(p.getId)),format.raw/*14.78*/("""">Buy Now</a>
			</div>
			</div>
		</div>
	""")))}/*18.4*/else/*18.9*/{_display_(Seq[Any](format.raw/*18.10*/("""
		"""),format.raw/*19.3*/("""<h2>Product Not Found</h2>
	""")))}),format.raw/*20.3*/("""
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(p:models.Product,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(p,user)

  def f:((models.Product,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (p,user) => apply(p,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 13:25:21 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/product.scala.html
                  HASH: fc4f773e1f216e281046191a1cd2fe940effa1e3
                  MATRIX: 976->1|1115->45|1143->48|1172->69|1211->71|1239->74|1260->87|1299->89|1329->93|1457->195|1466->196|1494->204|1574->258|1584->259|1620->274|1654->281|1729->329|1777->356|1806->357|1878->402|1893->408|1947->441|2010->487|2022->492|2061->493|2091->496|2150->525|2182->527
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|40->8|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|45->13|46->14|46->14|46->14|50->18|50->18|50->18|51->19|52->20|53->21
                  -- GENERATED --
              */
          