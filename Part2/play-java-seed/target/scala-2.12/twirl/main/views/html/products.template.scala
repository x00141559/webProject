
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
			"""),format.raw/*4.22*/("""
                    """),format.raw/*5.21*/("""<!-- Admin Login Dropup -->
                    <div class="dropdown admin-login">
                        <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Admin Login
                        <span class="caret"></span></button>
                        <ul class="dropdown-menu">
                            <li><form class="form container-fluid">
                            <div class="form-group">
                                <label for="email">Username:</label>
                                <input type="email" class="form-control" id="email">
                            </div>
                            <div class="form-group">
                                <label for="pwd">Password:</label>
                                <input type="password" class="form-control" id="pwd">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                            </form></li>
                        </ul>
                    </div>

										<h1 class="product-header">Our Products</h1>
										"""),format.raw/*25.95*/("""
										"""),_display_(/*26.12*/for(p <- products) yield /*26.30*/{_display_(Seq[Any](format.raw/*26.31*/("""
											"""),format.raw/*27.12*/("""<div class="panel-group container-fluid">
													<div class="panel panel-default">
															<div class="panel-heading">
															<h4 class="panel-title">
																	<a data-toggle="collapse" href="#collapse"""),_display_(/*31.60*/p/*31.61*/.getId),format.raw/*31.67*/("""">"""),_display_(/*31.70*/p/*31.71*/.getName),format.raw/*31.79*/("""</a>
															</h4>
													</div>
													<div id="collapse"""),_display_(/*34.32*/p/*34.33*/.getId),format.raw/*34.39*/("""" class="panel-collapse collapse">
															<div class="panel-body">
																	"""),_display_(/*36.19*/p/*36.20*/.getDescription),format.raw/*36.35*/("""
															"""),format.raw/*37.16*/("""</div>
															<div class="panel-footer">&euro; """),_display_(/*38.50*/("%.2f".format(p.getPrice))),format.raw/*38.77*/(""" """),format.raw/*38.78*/("""&nbsp;
																	<button class="btn btn-success" type="submit">Buy Now</button>
															</div>
													</div>
													</div>
												</div>
											</br>
										""")))}),format.raw/*45.12*/("""
                    """),format.raw/*46.21*/("""</div>
			"""),format.raw/*47.20*/("""
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 14:03:50 GMT 2017
                  SOURCE: /media/sf_student/CA/Part2/play-java-seed/app/views/products.scala.html
                  HASH: 9e2e10d1de06aec8078521c5954506c0aa552bc7
                  MATRIX: 965->1|1092->33|1122->38|1146->54|1185->56|1217->79|1266->101|2435->1326|2475->1339|2509->1357|2548->1358|2589->1371|2851->1606|2861->1607|2888->1613|2918->1616|2928->1617|2957->1625|3064->1705|3074->1706|3101->1712|3223->1807|3233->1808|3269->1823|3314->1840|3398->1897|3446->1924|3475->1925|3709->2128|3759->2150|3798->2177|3831->2180
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|57->25|58->26|58->26|58->26|59->27|63->31|63->31|63->31|63->31|63->31|63->31|66->34|66->34|66->34|68->36|68->36|68->36|69->37|70->38|70->38|70->38|77->45|78->46|79->47|80->48
                  -- GENERATED --
              */
          