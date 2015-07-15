// @SOURCE:D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/conf/routes
// @HASH:356357cd2a628fb4b18f38adb044cc508b08795b
// @DATE:Wed Jul 15 11:39:30 CEST 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_ClientiController_aggiungiCliente1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_cliente"))))
private[this] lazy val controllers_ClientiController_aggiungiCliente1_invoker = createInvoker(
controllers.ClientiController.aggiungiCliente(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "aggiungiCliente", Nil,"POST", """#GET     /add_cliente                controllers.ClientiController.show()""", Routes.prefix + """add_cliente"""))
        

// @LINE:9
private[this] lazy val controllers_ClientiController_getNumNoleggi2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getNoleggi"))))
private[this] lazy val controllers_ClientiController_getNumNoleggi2_invoker = createInvoker(
controllers.ClientiController.getNumNoleggi(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "getNumNoleggi", Nil,"GET", """""", Routes.prefix + """getNoleggi"""))
        

// @LINE:23
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_cliente""","""controllers.ClientiController.aggiungiCliente()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getNoleggi""","""controllers.ClientiController.getNumNoleggi()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:8
case controllers_ClientiController_aggiungiCliente1_route(params) => {
   call { 
        controllers_ClientiController_aggiungiCliente1_invoker.call(controllers.ClientiController.aggiungiCliente())
   }
}
        

// @LINE:9
case controllers_ClientiController_getNumNoleggi2_route(params) => {
   call { 
        controllers_ClientiController_getNumNoleggi2_invoker.call(controllers.ClientiController.getNumNoleggi())
   }
}
        

// @LINE:23
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     