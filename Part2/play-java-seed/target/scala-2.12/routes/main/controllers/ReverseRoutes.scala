
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/College/Web/play-java-seed/conf/routes
// @DATE:Fri Nov 17 18:08:37 GMT 2017

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

  
    // @LINE:12
    def search(query:String = "All"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search" + play.core.routing.queryString(List(if(query == "All") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("query", query)))))
    }
  
    // @LINE:11
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
  
    // @LINE:10
    def basket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
