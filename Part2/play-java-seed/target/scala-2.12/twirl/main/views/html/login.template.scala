
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
    """),format.raw/*5.5*/("""<div class="container-fluid">
        <h2>Login</h2>
    </div>

    <div class="col-xs-4">
        """),_display_(/*10.10*/if(loginForm.hasGlobalErrors)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
                """),_display_(/*12.18*/loginForm/*12.27*/.globalError.message),format.raw/*12.47*/("""
            """),format.raw/*13.13*/("""</p>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""<p class="alert alert-warning">
                """),_display_(/*17.18*/flash/*17.23*/.get("loginRequired")),format.raw/*17.44*/("""
            """),format.raw/*18.13*/("""</p>
        """)))}),format.raw/*19.10*/("""
        """),_display_(/*20.10*/helper/*20.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*20.80*/ {_display_(Seq[Any](format.raw/*20.82*/("""
            """),_display_(/*21.14*/CSRF/*21.18*/.formField),format.raw/*21.28*/("""
            """),format.raw/*22.13*/("""<div class="form-group">
                """),_display_(/*23.18*/inputText(loginForm("email"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*24.76*/("""
            """),format.raw/*25.13*/("""</div>
            <div class="form-group">
                """),_display_(/*27.18*/inputPassword(loginForm("password"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*28.79*/("""
            """),format.raw/*29.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-success">
            </div>
        """)))}),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 17:51:02 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/login.scala.html
                  HASH: 18572e3dc37d1c0772ccecd1fa69000534fa8d18
                  MATRIX: 966->1|1076->41|1121->38|1149->58|1177->61|1198->74|1237->76|1269->82|1402->188|1440->217|1480->219|1522->233|1599->283|1617->292|1658->312|1700->326|1746->341|1784->352|1823->382|1863->384|1905->398|1982->448|1996->453|2038->474|2080->488|2126->503|2164->514|2179->520|2252->584|2292->586|2334->601|2347->605|2378->615|2420->629|2490->672|2632->793|2674->807|2764->870|2916->1001|2958->1015|3143->1169|3176->1175
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|56->24|57->25|59->27|60->28|61->29|65->33|66->34
                  -- GENERATED --
              */
          