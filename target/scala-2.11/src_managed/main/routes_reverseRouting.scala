// @SOURCE:D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/conf/routes
// @HASH:d11471c38be90448284d993af70bae4a6c39ded7
// @DATE:Wed Jul 15 21:55:37 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:32
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:32
class ReverseAssets {


// @LINE:32
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:19
// @LINE:18
class ReversePrenotazioniController {


// @LINE:18
def show(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "add_prenotazione")
}
                        

// @LINE:19
def aggiungiPrenotazione(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "add_prenotazione")
}
                        

}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseClientiController {


// @LINE:7
def show(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "add_cliente")
}
                        

// @LINE:10
def aggiungiServiziCliente(codiceCliente:Integer): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "add_servizi_cliente" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("codiceCliente", codiceCliente)))))
}
                        

// @LINE:9
def show_all_clients(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "show_clienti")
}
                        

// @LINE:11
def getStats(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "stats")
}
                        

// @LINE:8
def aggiungiCliente(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "add_cliente")
}
                        

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReversePromozioniController {


// @LINE:14
def aggiungiPromoServizi(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "add_promo")
}
                        

// @LINE:15
def showTopPromo(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "get_top_promo")
}
                        

// @LINE:13
def show(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "add_promo")
}
                        

// @LINE:17
def getPromo(idPromo:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "get_promo" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("idPromo", idPromo)))))
}
                        

// @LINE:16
def showAllPromos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "get_all_promos")
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:32
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:32
class ReverseAssets {


// @LINE:32
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:19
// @LINE:18
class ReversePrenotazioniController {


// @LINE:18
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PrenotazioniController.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_prenotazione"})
      }
   """
)
                        

// @LINE:19
def aggiungiPrenotazione : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PrenotazioniController.aggiungiPrenotazione",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add_prenotazione"})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseClientiController {


// @LINE:7
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientiController.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_cliente"})
      }
   """
)
                        

// @LINE:10
def aggiungiServiziCliente : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientiController.aggiungiServiziCliente",
   """
      function(codiceCliente) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add_servizi_cliente" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("codiceCliente", codiceCliente)])})
      }
   """
)
                        

// @LINE:9
def show_all_clients : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientiController.show_all_clients",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show_clienti"})
      }
   """
)
                        

// @LINE:11
def getStats : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientiController.getStats",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stats"})
      }
   """
)
                        

// @LINE:8
def aggiungiCliente : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientiController.aggiungiCliente",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add_cliente"})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReversePromozioniController {


// @LINE:14
def aggiungiPromoServizi : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PromozioniController.aggiungiPromoServizi",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add_promo"})
      }
   """
)
                        

// @LINE:15
def showTopPromo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PromozioniController.showTopPromo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get_top_promo"})
      }
   """
)
                        

// @LINE:13
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PromozioniController.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_promo"})
      }
   """
)
                        

// @LINE:17
def getPromo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PromozioniController.getPromo",
   """
      function(idPromo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get_promo" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("idPromo", idPromo)])})
      }
   """
)
                        

// @LINE:16
def showAllPromos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PromozioniController.showAllPromos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get_all_promos"})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:32
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:32
class ReverseAssets {


// @LINE:32
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:19
// @LINE:18
class ReversePrenotazioniController {


// @LINE:18
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PrenotazioniController.show(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PrenotazioniController", "show", Seq(), "GET", """""", _prefix + """add_prenotazione""")
)
                      

// @LINE:19
def aggiungiPrenotazione(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PrenotazioniController.aggiungiPrenotazione(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PrenotazioniController", "aggiungiPrenotazione", Seq(), "POST", """""", _prefix + """add_prenotazione""")
)
                      

}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseClientiController {


// @LINE:7
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClientiController.show(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "show", Seq(), "GET", """""", _prefix + """add_cliente""")
)
                      

// @LINE:10
def aggiungiServiziCliente(codiceCliente:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClientiController.aggiungiServiziCliente(codiceCliente), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "aggiungiServiziCliente", Seq(classOf[Integer]), "POST", """""", _prefix + """add_servizi_cliente""")
)
                      

// @LINE:9
def show_all_clients(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClientiController.show_all_clients(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "show_all_clients", Seq(), "GET", """""", _prefix + """show_clienti""")
)
                      

// @LINE:11
def getStats(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClientiController.getStats(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "getStats", Seq(), "GET", """""", _prefix + """stats""")
)
                      

// @LINE:8
def aggiungiCliente(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClientiController.aggiungiCliente(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "aggiungiCliente", Seq(), "POST", """""", _prefix + """add_cliente""")
)
                      

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReversePromozioniController {


// @LINE:14
def aggiungiPromoServizi(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PromozioniController.aggiungiPromoServizi(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "aggiungiPromoServizi", Seq(), "POST", """""", _prefix + """add_promo""")
)
                      

// @LINE:15
def showTopPromo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PromozioniController.showTopPromo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "showTopPromo", Seq(), "GET", """""", _prefix + """get_top_promo""")
)
                      

// @LINE:13
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PromozioniController.show(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "show", Seq(), "GET", """GET         /get_dettagli_cliente    controllers.ClientiController.""", _prefix + """add_promo""")
)
                      

// @LINE:17
def getPromo(idPromo:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PromozioniController.getPromo(idPromo), HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "getPromo", Seq(classOf[Integer]), "GET", """""", _prefix + """get_promo""")
)
                      

// @LINE:16
def showAllPromos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PromozioniController.showAllPromos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PromozioniController", "showAllPromos", Seq(), "GET", """""", _prefix + """get_all_promos""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    