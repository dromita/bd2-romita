// @SOURCE:D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/conf/routes
// @HASH:b61d1e3af6a13e075f9d17b398fc4f8cac75a0a5
// @DATE:Fri Jul 17 01:21:15 CEST 2015


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
        

// @LINE:7
private[this] lazy val controllers_ClientiController_show1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_cliente"))))
private[this] lazy val controllers_ClientiController_show1_invoker = createInvoker(
controllers.ClientiController.show(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "show", Nil,"GET", """""", Routes.prefix + """add_cliente"""))
        

// @LINE:8
private[this] lazy val controllers_ClientiController_aggiungiCliente2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_cliente"))))
private[this] lazy val controllers_ClientiController_aggiungiCliente2_invoker = createInvoker(
controllers.ClientiController.aggiungiCliente(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "aggiungiCliente", Nil,"POST", """""", Routes.prefix + """add_cliente"""))
        

// @LINE:9
private[this] lazy val controllers_ClientiController_show_all_clients3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show_clienti"))))
private[this] lazy val controllers_ClientiController_show_all_clients3_invoker = createInvoker(
controllers.ClientiController.show_all_clients(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "show_all_clients", Nil,"GET", """""", Routes.prefix + """show_clienti"""))
        

// @LINE:10
private[this] lazy val controllers_ClientiController_aggiungiServiziCliente4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_servizi_cliente"))))
private[this] lazy val controllers_ClientiController_aggiungiServiziCliente4_invoker = createInvoker(
controllers.ClientiController.aggiungiServiziCliente(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "aggiungiServiziCliente", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """add_servizi_cliente"""))
        

// @LINE:11
private[this] lazy val controllers_ClientiController_getStats5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stats"))))
private[this] lazy val controllers_ClientiController_getStats5_invoker = createInvoker(
controllers.ClientiController.getStats(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "getStats", Nil,"GET", """""", Routes.prefix + """stats"""))
        

// @LINE:13
private[this] lazy val controllers_PromozioniController_show6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_promo"))))
private[this] lazy val controllers_PromozioniController_show6_invoker = createInvoker(
controllers.PromozioniController.show(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "show", Nil,"GET", """GET         /get_dettagli_cliente    controllers.ClientiController.""", Routes.prefix + """add_promo"""))
        

// @LINE:14
private[this] lazy val controllers_PromozioniController_aggiungiPromoServizi7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_promo"))))
private[this] lazy val controllers_PromozioniController_aggiungiPromoServizi7_invoker = createInvoker(
controllers.PromozioniController.aggiungiPromoServizi(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "aggiungiPromoServizi", Nil,"POST", """""", Routes.prefix + """add_promo"""))
        

// @LINE:15
private[this] lazy val controllers_PromozioniController_showTopPromo8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("get_top_promo"))))
private[this] lazy val controllers_PromozioniController_showTopPromo8_invoker = createInvoker(
controllers.PromozioniController.showTopPromo(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "showTopPromo", Nil,"GET", """""", Routes.prefix + """get_top_promo"""))
        

// @LINE:23
private[this] lazy val controllers_Assets_at9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_cliente""","""controllers.ClientiController.show()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_cliente""","""controllers.ClientiController.aggiungiCliente()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show_clienti""","""controllers.ClientiController.show_all_clients()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_servizi_cliente""","""controllers.ClientiController.aggiungiServiziCliente(codiceCliente:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stats""","""controllers.ClientiController.getStats()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_promo""","""controllers.PromozioniController.show()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_promo""","""controllers.PromozioniController.aggiungiPromoServizi()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """get_top_promo""","""controllers.PromozioniController.showTopPromo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:7
case controllers_ClientiController_show1_route(params) => {
   call { 
        controllers_ClientiController_show1_invoker.call(controllers.ClientiController.show())
   }
}
        

// @LINE:8
case controllers_ClientiController_aggiungiCliente2_route(params) => {
   call { 
        controllers_ClientiController_aggiungiCliente2_invoker.call(controllers.ClientiController.aggiungiCliente())
   }
}
        

// @LINE:9
case controllers_ClientiController_show_all_clients3_route(params) => {
   call { 
        controllers_ClientiController_show_all_clients3_invoker.call(controllers.ClientiController.show_all_clients())
   }
}
        

// @LINE:10
case controllers_ClientiController_aggiungiServiziCliente4_route(params) => {
   call(params.fromQuery[Integer]("codiceCliente", None)) { (codiceCliente) =>
        controllers_ClientiController_aggiungiServiziCliente4_invoker.call(controllers.ClientiController.aggiungiServiziCliente(codiceCliente))
   }
}
        

// @LINE:11
case controllers_ClientiController_getStats5_route(params) => {
   call { 
        controllers_ClientiController_getStats5_invoker.call(controllers.ClientiController.getStats())
   }
}
        

// @LINE:13
case controllers_PromozioniController_show6_route(params) => {
   call { 
        controllers_PromozioniController_show6_invoker.call(controllers.PromozioniController.show())
   }
}
        

// @LINE:14
case controllers_PromozioniController_aggiungiPromoServizi7_route(params) => {
   call { 
        controllers_PromozioniController_aggiungiPromoServizi7_invoker.call(controllers.PromozioniController.aggiungiPromoServizi())
   }
}
        

// @LINE:15
case controllers_PromozioniController_showTopPromo8_route(params) => {
   call { 
        controllers_PromozioniController_showTopPromo8_invoker.call(controllers.PromozioniController.showTopPromo())
   }
}
        

// @LINE:23
case controllers_Assets_at9_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     