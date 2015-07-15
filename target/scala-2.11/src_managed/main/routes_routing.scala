// @SOURCE:D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/conf/routes
// @HASH:b95a41d3c8413b643ac5a9e5b1bc50ccaa889b9e
// @DATE:Wed Jul 15 15:29:13 CEST 2015


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
private[this] lazy val controllers_ClientiController_getNumNoleggi3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getNoleggi"))))
private[this] lazy val controllers_ClientiController_getNumNoleggi3_invoker = createInvoker(
controllers.ClientiController.getNumNoleggi(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "getNumNoleggi", Nil,"GET", """""", Routes.prefix + """getNoleggi"""))
        

// @LINE:10
private[this] lazy val controllers_PromozioniController_show4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_promo"))))
private[this] lazy val controllers_PromozioniController_show4_invoker = createInvoker(
controllers.PromozioniController.show(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "show", Nil,"GET", """""", Routes.prefix + """add_promo"""))
        

// @LINE:11
private[this] lazy val controllers_PromozioniController_aggiungiPromozione5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_promo"))))
private[this] lazy val controllers_PromozioniController_aggiungiPromozione5_invoker = createInvoker(
controllers.PromozioniController.aggiungiPromozione(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "aggiungiPromozione", Nil,"POST", """""", Routes.prefix + """add_promo"""))
        

// @LINE:12
private[this] lazy val controllers_PromozioniController_showTopPromo6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("get_top_promo"))))
private[this] lazy val controllers_PromozioniController_showTopPromo6_invoker = createInvoker(
controllers.PromozioniController.showTopPromo(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "showTopPromo", Nil,"GET", """""", Routes.prefix + """get_top_promo"""))
        

// @LINE:13
private[this] lazy val controllers_PromozioniController_showAllPromos7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("get_all_promos"))))
private[this] lazy val controllers_PromozioniController_showAllPromos7_invoker = createInvoker(
controllers.PromozioniController.showAllPromos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "showAllPromos", Nil,"GET", """""", Routes.prefix + """get_all_promos"""))
        

// @LINE:14
private[this] lazy val controllers_PromozioniController_getPromo8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("get_promo"))))
private[this] lazy val controllers_PromozioniController_getPromo8_invoker = createInvoker(
controllers.PromozioniController.getPromo(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "getPromo", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """get_promo"""))
        

// @LINE:15
private[this] lazy val controllers_PrenotazioniController_show9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_prenotazione"))))
private[this] lazy val controllers_PrenotazioniController_show9_invoker = createInvoker(
controllers.PrenotazioniController.show(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PrenotazioniController", "show", Nil,"GET", """""", Routes.prefix + """add_prenotazione"""))
        

// @LINE:16
private[this] lazy val controllers_PrenotazioniController_aggiungiPrenotazione10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add_prenotazione"))))
private[this] lazy val controllers_PrenotazioniController_aggiungiPrenotazione10_invoker = createInvoker(
controllers.PrenotazioniController.aggiungiPrenotazione(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PrenotazioniController", "aggiungiPrenotazione", Nil,"POST", """""", Routes.prefix + """add_prenotazione"""))
        

// @LINE:29
private[this] lazy val controllers_Assets_at11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_cliente""","""controllers.ClientiController.show()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_cliente""","""controllers.ClientiController.aggiungiCliente()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getNoleggi""","""controllers.ClientiController.getNumNoleggi()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_promo""","""controllers.PromozioniController.show()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_promo""","""controllers.PromozioniController.aggiungiPromozione()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """get_top_promo""","""controllers.PromozioniController.showTopPromo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """get_all_promos""","""controllers.PromozioniController.showAllPromos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """get_promo""","""controllers.PromozioniController.getPromo(idPromo:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_prenotazione""","""controllers.PrenotazioniController.show()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add_prenotazione""","""controllers.PrenotazioniController.aggiungiPrenotazione()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_ClientiController_getNumNoleggi3_route(params) => {
   call { 
        controllers_ClientiController_getNumNoleggi3_invoker.call(controllers.ClientiController.getNumNoleggi())
   }
}
        

// @LINE:10
case controllers_PromozioniController_show4_route(params) => {
   call { 
        controllers_PromozioniController_show4_invoker.call(controllers.PromozioniController.show())
   }
}
        

// @LINE:11
case controllers_PromozioniController_aggiungiPromozione5_route(params) => {
   call { 
        controllers_PromozioniController_aggiungiPromozione5_invoker.call(controllers.PromozioniController.aggiungiPromozione())
   }
}
        

// @LINE:12
case controllers_PromozioniController_showTopPromo6_route(params) => {
   call { 
        controllers_PromozioniController_showTopPromo6_invoker.call(controllers.PromozioniController.showTopPromo())
   }
}
        

// @LINE:13
case controllers_PromozioniController_showAllPromos7_route(params) => {
   call { 
        controllers_PromozioniController_showAllPromos7_invoker.call(controllers.PromozioniController.showAllPromos())
   }
}
        

// @LINE:14
case controllers_PromozioniController_getPromo8_route(params) => {
   call(params.fromQuery[Integer]("idPromo", None)) { (idPromo) =>
        controllers_PromozioniController_getPromo8_invoker.call(controllers.PromozioniController.getPromo(idPromo))
   }
}
        

// @LINE:15
case controllers_PrenotazioniController_show9_route(params) => {
   call { 
        controllers_PrenotazioniController_show9_invoker.call(controllers.PrenotazioniController.show())
   }
}
        

// @LINE:16
case controllers_PrenotazioniController_aggiungiPrenotazione10_route(params) => {
   call { 
        controllers_PrenotazioniController_aggiungiPrenotazione10_invoker.call(controllers.PrenotazioniController.aggiungiPrenotazione())
   }
}
        

// @LINE:29
case controllers_Assets_at11_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at11_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     