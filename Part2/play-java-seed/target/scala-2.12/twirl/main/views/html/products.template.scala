
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("Products", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
			"""),format.raw/*4.22*/("""
			"""),_display_(/*5.5*/if(user != null)/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
				"""),_display_(/*6.6*/if(user.getRole == "admin")/*6.33*/ {_display_(Seq[Any](format.raw/*6.35*/("""
					"""),format.raw/*7.6*/("""<a href=""""),_display_(/*7.16*/routes/*7.22*/.HomeController.addProduct()),format.raw/*7.50*/("""" class="btn btn-info">Add a Product</a>
				""")))}),format.raw/*8.6*/("""	
			""")))}),format.raw/*9.5*/("""
			"""),format.raw/*10.4*/("""<h1 class="product-header">Our Products</h1>
				"""),_display_(/*11.6*/for(p <- products) yield /*11.24*/{_display_(Seq[Any](format.raw/*11.25*/("""
 				"""),format.raw/*12.6*/("""<div class="panel-group container-fluid">
					<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" href="#collapse"""),_display_(/*16.50*/p/*16.51*/.getId),format.raw/*16.57*/("""">"""),_display_(/*16.60*/p/*16.61*/.getName),format.raw/*16.69*/("""</a>
						</h4>
					</div>
					<div id="collapse"""),_display_(/*19.24*/p/*19.25*/.getId),format.raw/*19.31*/("""" class="panel-collapse collapse">
						<div class="panel-body">
							"""),_display_(/*21.9*/p/*21.10*/.getDescription),format.raw/*21.25*/("""
						"""),format.raw/*22.7*/("""</div>
						<div class="panel-footer">&euro; """),_display_(/*23.41*/("%.2f".format(p.getPrice))),format.raw/*23.68*/(""" """),format.raw/*23.69*/("""&nbsp;
								<a class="btn btn-success" href=""""),_display_(/*24.43*/routes/*24.49*/.HomeController.purchase(p.getId)),format.raw/*24.82*/("""">Buy Now</a>
								<a class="btn btn-info" href=""""),_display_(/*25.40*/routes/*25.46*/.HomeController.product(p.getId)),format.raw/*25.78*/("""">
									<span class="glyphicon glyphicon-open"></span>
								</a>
							"""),_display_(/*28.9*/if(user != null)/*28.25*/ {_display_(Seq[Any](format.raw/*28.27*/("""
								"""),_display_(/*29.10*/if(user.getRole == "admin")/*29.37*/ {_display_(Seq[Any](format.raw/*29.39*/("""
									"""),format.raw/*30.10*/("""<a class="btn btn-danger" href=""""),_display_(/*30.43*/routes/*30.49*/.HomeController.deleteProduct(p.getId)),format.raw/*30.87*/("""">Delete</a>
								""")))}),format.raw/*31.10*/("""
							""")))}),format.raw/*32.9*/("""
						"""),format.raw/*33.7*/("""</div>
					</div>
					</div>
				</div>
			</br>
			""")))}),format.raw/*38.5*/("""
			"""),format.raw/*39.20*/("""
""")))}),format.raw/*40.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,user)

  def f:((List[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,user) => apply(products,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 13:25:20 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/products.scala.html
                  HASH: d020d4c6e336900fc4f98d274b6722ea16065396
                  MATRIX: 983->1|1135->58|1163->61|1193->83|1232->85|1263->107|1293->112|1317->128|1356->130|1387->136|1422->163|1461->165|1493->171|1529->181|1543->187|1591->215|1666->261|1701->267|1732->271|1808->321|1842->339|1881->340|1914->346|2135->540|2145->541|2172->547|2202->550|2212->551|2241->559|2320->611|2330->612|2357->618|2457->692|2467->693|2503->708|2537->715|2611->762|2659->789|2688->790|2764->839|2779->845|2833->878|2913->931|2928->937|2981->969|3087->1049|3112->1065|3152->1067|3189->1077|3225->1104|3265->1106|3303->1116|3363->1149|3378->1155|3437->1193|3490->1215|3529->1224|3563->1231|3648->1286|3680->1306|3712->1308
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|41->9|42->10|43->11|43->11|43->11|44->12|48->16|48->16|48->16|48->16|48->16|48->16|51->19|51->19|51->19|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|62->30|63->31|64->32|65->33|70->38|71->39|72->40
                  -- GENERATED --
              */
          