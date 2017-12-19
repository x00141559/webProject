
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("About",user)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
			"""),format.raw/*4.21*/("""
			"""),format.raw/*5.4*/("""<div class ="container-fluid">
					<h1 class="about-header">About Us</h1>
						  <div class ="about-Image"><img src=""""),_display_(/*7.46*/routes/*7.52*/.Assets.versioned("images/AboutImage.jpg")),format.raw/*7.94*/("""" class=" img-responsive" alt="About Logo"></div>
						  <h4 class = "well about-body">
						  Software.ie was founded in 2017 by three friends in co Dublin.</br> 
						  We employ over 400 people in 7 different countries across
						  the globe. </br> 
						  We work with out partners in the US and Japan. </br>
						  Software.ie is the worlds most raplidy growing online store for software keys.
						  We pride ourselves on being the best for value and customer service.</p>
						  </h4>
							<h2>Contact Us</h2>
							<p>Contact Details</p>            
								<table class="table table-striped">
								  <thead>
									<tr>
									  <th>Telephone:</th>
									  <th>Address:</th>
									  <th>Email</th>
									</tr>
								  </thead>
								  <tbody>
									<tr>
									  <td>0875643656</td>
									  <td>123 Main St</td>
									  <td>software.ie@gmail.com</td>
									</tr>
									
									</tr>
								  </tbody>
								</table>
							  </div>
					"""),format.raw/*37.21*/("""
""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 00:03:05 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/about.scala.html
                  HASH: 72a0d681b2975ba55e02ebdd00699289e4aaafda
                  MATRIX: 959->1|1079->26|1109->31|1135->49|1174->51|1206->73|1237->78|1385->200|1399->206|1461->248|2519->1294|2552->1297
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|39->7|39->7|39->7|69->37|70->38
                  -- GENERATED --
              */
          