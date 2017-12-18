
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
  def apply/*2.2*/(title: String,user : models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Software.ie - """),_display_(/*7.31*/title),format.raw/*7.36*/("""</title>
		    <meta charset="UTF-8">        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("styles/main.css")),format.raw/*11.96*/("""">
		    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script> 
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("scripts/search.js")),format.raw/*13.67*/(""""></script>
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
								<a href=""""),_display_(/*28.19*/routes/*28.25*/.LoginController.login()),format.raw/*28.49*/("""" style="color: #00d7d7">Login</a>
                        </li>
                    </li>
                    <li """),_display_(/*31.26*/if(title=="Login")/*31.44*/{_display_(Seq[Any](format.raw/*31.45*/("""class="active"""")))}),format.raw/*31.60*/(""">
                        """),_display_(/*32.26*/if(user != null)/*32.42*/ {_display_(Seq[Any](format.raw/*32.44*/("""
                            """),format.raw/*33.29*/("""<a href=""""),_display_(/*33.39*/routes/*33.45*/.LoginController.logout()),format.raw/*33.70*/(""""></a><a href="/" style="color: #00d7d7">Home</a>>Logout """),_display_(/*33.128*/user/*33.132*/.getName()),format.raw/*33.142*/("""</a>
                        """)))}/*34.27*/else/*34.32*/{_display_(Seq[Any](format.raw/*34.33*/("""
                            """),format.raw/*35.29*/("""<a href=""""),_display_(/*35.39*/routes/*35.45*/.LoginController.login()),format.raw/*35.69*/("""">Login</a>
                        """)))}),format.raw/*36.26*/("""
    
                    """),format.raw/*38.21*/("""</li>
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
                    """),_display_(/*54.22*/content),format.raw/*54.29*/("""
                """),format.raw/*55.17*/("""</main>
                
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
                  DATE: Mon Dec 18 15:54:01 GMT 2017
                  SOURCE: /home/wdd/webapps/webProject/Part2/play-java-seed/app/views/main.scala.html
                  HASH: e100693b0c82fc1666a77591105f4e2d8b6c96bb
                  MATRIX: 984->20|1134->75|1162->77|1262->151|1287->156|1727->569|1742->575|1799->611|2058->843|2073->849|2132->887|2579->1307|2607->1326|2646->1327|2692->1342|2798->1421|2827->1441|2866->1442|2912->1457|3024->1542|3056->1565|3095->1566|3141->1581|3259->1672|3286->1690|3325->1691|3371->1706|3418->1726|3433->1732|3478->1756|3621->1872|3648->1890|3687->1891|3733->1906|3787->1933|3812->1949|3852->1951|3909->1980|3946->1990|3961->1996|4007->2021|4093->2079|4107->2083|4139->2093|4188->2124|4201->2129|4240->2130|4297->2159|4334->2169|4349->2175|4394->2199|4462->2236|4516->2262|5282->3001|5310->3008|5355->3025
                  LINES: 28->2|33->2|35->4|38->7|38->7|42->11|42->11|42->11|44->13|44->13|44->13|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|62->31|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|69->38|85->54|85->54|86->55
                  -- GENERATED --
              */
          