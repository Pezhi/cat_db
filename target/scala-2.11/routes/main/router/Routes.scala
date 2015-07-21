
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Pazhman/Documents/Projects/Play2/cat_db/conf/routes
// @DATE:Tue Jul 21 18:29:21 EEST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:16
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:16
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cat""", """controllers.Application.add_update_del_Cat"""),
    ("""POST""", this.prefix, """controllers.Application.upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catFormInit""", """controllers.Application.catFormInit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cats""", """controllers.Application.getCats"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Application.upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/$name<.+>""", """controllers.Application.images(name:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_add_update_del_Cat1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cat")))
  )
  private[this] lazy val controllers_Application_add_update_del_Cat1_invoker = createInvoker(
    Application_1.add_update_del_Cat,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "add_update_del_Cat",
      Nil,
      "POST",
      """""",
      this.prefix + """cat"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_upload2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_upload2_invoker = createInvoker(
    Application_1.upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_catFormInit3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catFormInit")))
  )
  private[this] lazy val controllers_Application_catFormInit3_invoker = createInvoker(
    Application_1.catFormInit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "catFormInit",
      Nil,
      "GET",
      """""",
      this.prefix + """catFormInit"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_getCats4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cats")))
  )
  private[this] lazy val controllers_Application_getCats4_invoker = createInvoker(
    Application_1.getCats,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getCats",
      Nil,
      "GET",
      """""",
      this.prefix + """cats"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_upload6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Application_upload6_invoker = createInvoker(
    Application_1.upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "upload",
      Nil,
      "GET",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_images7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("name", """.+""",false)))
  )
  private[this] lazy val controllers_Application_images7_invoker = createInvoker(
    Application_1.images(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "images",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """images/$name<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:8
    case controllers_Application_add_update_del_Cat1_route(params) =>
      call { 
        controllers_Application_add_update_del_Cat1_invoker.call(Application_1.add_update_del_Cat)
      }
  
    // @LINE:9
    case controllers_Application_upload2_route(params) =>
      call { 
        controllers_Application_upload2_invoker.call(Application_1.upload)
      }
  
    // @LINE:11
    case controllers_Application_catFormInit3_route(params) =>
      call { 
        controllers_Application_catFormInit3_invoker.call(Application_1.catFormInit)
      }
  
    // @LINE:13
    case controllers_Application_getCats4_route(params) =>
      call { 
        controllers_Application_getCats4_invoker.call(Application_1.getCats)
      }
  
    // @LINE:16
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:18
    case controllers_Application_upload6_route(params) =>
      call { 
        controllers_Application_upload6_invoker.call(Application_1.upload)
      }
  
    // @LINE:20
    case controllers_Application_images7_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_images7_invoker.call(Application_1.images(name))
      }
  }
}