
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
                <div><a href=""""),_display_(/*17.32*/routes/*17.38*/.ClientiController.aggiungiCliente()),format.raw/*17.74*/("""">Aggiungi cliente</a></div>
                <div><a href=""""),_display_(/*18.32*/routes/*18.38*/.ClientiController.show_edit()),format.raw/*18.68*/("""">Modifica cliente</a></div>
            </div>
        </div>
        <div class="row clearfix">
            <div class="col-md-12 column">
                <h3 class="text-left text-info">
                    Gestione Autisti
                </h3>
                <div><a href=""""),_display_(/*26.32*/routes/*26.38*/.AutistiController.show()),format.raw/*26.63*/("""">Assumi nuovo autista</a></div>
                <div><a href=""""),_display_(/*27.32*/routes/*27.38*/.AutistiController.autisti_corse_giornaliere()),format.raw/*27.84*/("""">Stampa info corse-autisti</a></div>
            </div>
        </div>
        <div class="row clearfix">
            <div class="col-md-12 column">
                <h3 class="text-left text-info">
                    Gestione Linee
                </h3>
                <div><a href=""""),_display_(/*35.32*/routes/*35.38*/.LineeController.show_most_traveled_lines()),format.raw/*35.81*/("""">Linee traffico</a></div>
                <div><a href=""""),_display_(/*36.32*/routes/*36.38*/.LineeController.all_percorsi_with_times()),format.raw/*36.80*/("""">Mostra percorsi</a></div>
            </div>
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
                  DATE: Wed Jul 15 02:53:16 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/dashboard.scala.html
                  HASH: 83d415aa2d40c47307406df5c8808cd44e69e666
                  MATRIX: 802->1|827->18|866->20|898->26|971->73|1008->102|1047->104|1087->117|1146->150|1159->155|1194->170|1234->183|1278->197|1314->206|1566->431|1581->437|1638->473|1725->533|1740->539|1791->569|2098->849|2113->855|2159->880|2250->944|2265->950|2332->996|2646->1283|2661->1289|2725->1332|2810->1390|2825->1396|2888->1438
                  LINES: 29->1|29->1|29->1|31->3|33->5|33->5|33->5|34->6|35->7|35->7|35->7|36->8|37->9|38->10|45->17|45->17|45->17|46->18|46->18|46->18|54->26|54->26|54->26|55->27|55->27|55->27|63->35|63->35|63->35|64->36|64->36|64->36
                  -- GENERATED --
              */
          