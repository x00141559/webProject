
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jordo/Desktop/GitCA2/Part2/play-java-seed/conf/routes
// @DATE:Fri Dec 15 15:54:08 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def search(query:String = "All"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search" + play.core.routing.queryString(List(if(query == "All") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("query", query)))))
    }
  
    // @LINE:10
    def purchase(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "purchase")
    }
  
    // @LINE:8
    def products(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:9
    def product(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product")
    }
  
    // @LINE:7
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:12
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
