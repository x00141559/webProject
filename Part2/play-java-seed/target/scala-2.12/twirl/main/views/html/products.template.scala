
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

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
										"""),_display_(/*26.12*/for(i <- 1 to 10) yield /*26.29*/{_display_(Seq[Any](format.raw/*26.30*/("""
											"""),format.raw/*27.12*/("""<div class="panel-group container-fluid">
													<div class="panel panel-default">
															<div class="panel-heading">
															<h4 class="panel-title">
																	<a data-toggle="collapse" href="#collapse"""),_display_(/*31.60*/i),format.raw/*31.61*/("""">Example Product Name</a>
															</h4>
													</div>
													<div id="collapse"""),_display_(/*34.32*/i),format.raw/*34.33*/("""" class="panel-collapse collapse">
															<div class="panel-body">
																	Example Product Description/Images
															</div>
															<div class="panel-footer">&euro;0.00 &nbsp; """),format.raw/*38.74*/("""
																	"""),format.raw/*39.18*/("""<button class="btn btn-success" type="submit">Add to Cart</button>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 17 18:08:38 GMT 2017
                  SOURCE: E:/College/Web/play-java-seed/app/views/products.scala.html
                  HASH: 58e3ec91687273ac4161167d15cc8648ad75707e
                  MATRIX: 944->1|1040->3|1068->6|1092->22|1131->24|1162->46|1210->67|2359->1272|2398->1284|2431->1301|2470->1302|2510->1314|2768->1545|2790->1546|2916->1645|2938->1646|3174->1868|3220->1886|3427->2062|3476->2083|3514->2109|3546->2111
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|57->25|58->26|58->26|58->26|59->27|63->31|63->31|66->34|66->34|70->38|71->39|77->45|78->46|79->47|80->48
                  -- GENERATED --
              */
          