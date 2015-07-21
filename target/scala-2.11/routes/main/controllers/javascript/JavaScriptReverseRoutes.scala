
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Pazhman/Documents/Projects/Play2/cat_db/conf/routes
// @DATE:Tue Jul 21 18:29:21 EEST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.upload",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:11
    def catFormInit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.catFormInit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "catFormInit"})
        }
      """
    )
  
    // @LINE:20
    def images: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.images",
      """
        function(name) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", name)})
        }
      """
    )
  
    // @LINE:13
    def getCats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getCats",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cats"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def add_update_del_Cat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.add_update_del_Cat",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cat"})
        }
      """
    )
  
  }


}