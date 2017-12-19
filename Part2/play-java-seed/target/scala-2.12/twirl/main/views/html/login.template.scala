
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login",user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
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

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 23:12:02 GMT 2017
                  SOURCE: C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/app/views/login.scala.html
                  HASH: 3cb322d197ad97159f3d53ef075f60f085e42c5d
                  MATRIX: 984->1|1118->65|1163->62|1191->82|1219->85|1245->103|1284->105|1316->111|1449->217|1487->246|1527->248|1569->262|1646->312|1664->321|1705->341|1747->355|1793->370|1831->381|1870->411|1910->413|1952->427|2029->477|2043->482|2085->503|2127->517|2173->532|2211->543|2226->549|2299->613|2339->615|2381->630|2394->634|2425->644|2467->658|2537->701|2679->822|2721->836|2811->899|2963->1030|3005->1044|3190->1198|3223->1204
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|56->24|57->25|59->27|60->28|61->29|65->33|66->34
                  -- GENERATED --
              */
          