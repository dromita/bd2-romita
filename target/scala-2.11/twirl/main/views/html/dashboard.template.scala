
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Dashboard")/*1.19*/ {_display_(Seq[Any](format.raw/*1.21*/("""

    """),format.raw/*3.5*/("""<div class="container">
        <div>
        """),_display_(/*5.10*/if(flash.contains("success"))/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
            """),format.raw/*6.13*/("""<p class="success">
            """),_display_(/*7.14*/flash/*7.19*/.get("success")),format.raw/*7.34*/("""
            """),format.raw/*8.13*/("""</p>
        """)))}),format.raw/*9.10*/("""
        """),format.raw/*10.9*/("""</div>

        <div class="row clearfix">
            <div class="col-md-12 column">
                <h3 class="text-left text-info">
                    Gestione Clienti
                </h3>
                """),format.raw/*17.106*/("""
                """),format.raw/*18.100*/("""
            """),format.raw/*19.13*/("""</div>
        </div>
        <div class="row clearfix">
            <div class="col-md-12 column">
                <h3 class="text-left text-info">
                    Gestione Autisti
                </h3>
                """),format.raw/*26.99*/("""
                """),format.raw/*27.125*/("""
            """),format.raw/*28.13*/("""</div>
        </div>
        <div class="row clearfix">
            <div class="col-md-12 column">
                <h3 class="text-left text-info">
                    Gestione Linee
                </h3>
                """),format.raw/*35.111*/("""
                """),format.raw/*36.111*/("""
            """),format.raw/*37.13*/("""</div>
        </div>
    </div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 17:56:43 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/dashboard.scala.html
                  HASH: 14a7e19ecbcb1410a31f94137a5a88fd03f429ff
                  MATRIX: 802->1|827->18|866->20|898->26|971->73|1008->102|1047->104|1087->117|1146->150|1159->155|1194->170|1234->183|1278->197|1314->206|1553->505|1599->605|1640->618|1892->924|1938->1049|1979->1062|2230->1378|2276->1489|2317->1502
                  LINES: 29->1|29->1|29->1|31->3|33->5|33->5|33->5|34->6|35->7|35->7|35->7|36->8|37->9|38->10|45->17|46->18|47->19|54->26|55->27|56->28|63->35|64->36|65->37
                  -- GENERATED --
              */
          