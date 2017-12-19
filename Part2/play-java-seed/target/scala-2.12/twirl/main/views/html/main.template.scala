
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* Start Jordan */
  def apply/*2.2*/(title: String, user : models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.58*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Software.ie - """),_display_(/*7.31*/title),format.raw/*7.36*/("""</title>
		    <meta charset="UTF-8">        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("styles/main.css")),format.raw/*11.96*/("""">
		    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script> 
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("scripts/main.js")),format.raw/*13.65*/(""""></script>
    </head>
    <body>
        <div id="outer-content-wrapper">
            <header>
                <h1>Software.ie</h1>
            </header>
            <div id ="content-wrapper">
                <nav class="navbar navbar-default">
                    <div class="container-fluid" style="background-color: rgb(215,215,215)">
                      <ul class="nav navbar-nav">
                        <li """),_display_(/*24.30*/if(title == "Home")/*24.49*/{_display_(Seq[Any](format.raw/*24.50*/("""class="active"""")))}),format.raw/*24.65*/("""><a href="/" style="color: #00d7d7">Home</a></li>
                        <li """),_display_(/*25.30*/if(title == "About")/*25.50*/{_display_(Seq[Any](format.raw/*25.51*/("""class="active"""")))}),format.raw/*25.66*/("""><a href="/about" style="color: #00d7d7">About</a></li>
                        <li """),_display_(/*26.30*/if(title == "Products")/*26.53*/{_display_(Seq[Any](format.raw/*26.54*/("""class="active"""")))}),format.raw/*26.69*/("""><a href="/products" style="color: #00d7d7">Products</a></li>
                        <li """),_display_(/*27.30*/if(title=="Login")/*27.48*/{_display_(Seq[Any](format.raw/*27.49*/("""class="active"""")))}),format.raw/*27.64*/(""">
                                """),_display_(/*28.34*/if(user != null)/*28.50*/ {_display_(Seq[Any](format.raw/*28.52*/("""
                                    """),format.raw/*29.37*/("""<a href=""""),_display_(/*29.47*/routes/*29.53*/.LoginController.logout()),format.raw/*29.78*/("""" style="color: #00d7d7">Logout """),_display_(/*29.111*/user/*29.115*/.getName()),format.raw/*29.125*/("""</a>
                                """)))}/*30.35*/else/*30.40*/{_display_(Seq[Any](format.raw/*30.41*/("""
                                    """),format.raw/*31.37*/("""<a href=""""),_display_(/*31.47*/routes/*31.53*/.LoginController.login()),format.raw/*31.77*/("""" style="color: #00d7d7">Login</a>
                                """)))}),format.raw/*32.34*/("""
                        """),format.raw/*33.25*/("""</li>
                </ul>
                    </ul>
                      <form class="navbar-form navbar-left pull-right">
                        <div class="input-group">
                          <input type="text" id="searchContent" class="form-control" placeholder="Search">
                          <div class="input-group-btn">
                            <button class="btn btn-default" type="button" onclick="return search()">
                              <i class="glyphicon glyphicon-search"></i>
                            </button>
                          </div>
                        </div>
                      </form>
                    </div>
                </nav>
                <main>
                    """),_display_(/*49.22*/content),format.raw/*49.29*/("""
                """),format.raw/*50.17*/("""</main>
                
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 18:35:22 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/main.scala.html
                  HASH: 9c08a249030e8adfc2b32a863a80fb6a5c8ee1fb
                  MATRIX: 984->21|1135->77|1165->81|1268->158|1293->163|1737->580|1752->586|1809->622|2070->856|2085->862|2142->898|2600->1329|2628->1348|2667->1349|2713->1364|2820->1444|2849->1464|2888->1465|2934->1480|3047->1566|3079->1589|3118->1590|3164->1605|3283->1697|3310->1715|3349->1716|3395->1731|3458->1767|3483->1783|3523->1785|3589->1823|3626->1833|3641->1839|3687->1864|3748->1897|3762->1901|3794->1911|3852->1951|3865->1956|3904->1957|3970->1995|4007->2005|4022->2011|4067->2035|4167->2104|4221->2130|5003->2885|5031->2892|5077->2910
                  LINES: 28->2|33->2|35->4|38->7|38->7|42->11|42->11|42->11|44->13|44->13|44->13|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|63->32|64->33|80->49|80->49|81->50
                  -- GENERATED --
              */
          