// @SOURCE:D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/conf/routes
// @HASH:356357cd2a628fb4b18f38adb044cc508b08795b
// @DATE:Wed Jul 15 11:39:30 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:23
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:23
class ReverseAssets {


// @LINE:23
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:9
// @LINE:8
class ReverseClientiController {


// @LINE:8
def aggiungiCliente(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "add_cliente")
}
                        

// @LINE:9
def getNumNoleggi(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getNoleggi")
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
                  


// @LINE:23
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:23
class ReverseAssets {


// @LINE:23
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:9
// @LINE:8
class ReverseClientiController {


// @LINE:8
def aggiungiCliente : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientiController.aggiungiCliente",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add_cliente"})
      }
   """
)
                        

// @LINE:9
def getNumNoleggi : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientiController.getNumNoleggi",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getNoleggi"})
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
        


// @LINE:23
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:23
class ReverseAssets {


// @LINE:23
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:9
// @LINE:8
class ReverseClientiController {


// @LINE:8
def aggiungiCliente(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClientiController.aggiungiCliente(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "aggiungiCliente", Seq(), "POST", """#GET     /add_cliente                controllers.ClientiController.show()""", _prefix + """add_cliente""")
)
                      

// @LINE:9
def getNumNoleggi(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClientiController.getNumNoleggi(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClientiController", "getNumNoleggi", Seq(), "GET", """""", _prefix + """getNoleggi""")
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
        
    