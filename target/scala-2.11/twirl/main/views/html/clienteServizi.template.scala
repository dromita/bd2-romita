
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
object clienteServizi extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[model.ClientiEntity,Form[model.forms.ServiziClientiForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cliente: model.ClientiEntity, clienteServiziForm: Form[model.forms.ServiziClientiForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import tags._
import helper._
import views.html.helper._

Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/main("Aggiungi Servizi")/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""


    """),format.raw/*11.5*/("""<div class="container">

        """),_display_(/*13.10*/helper/*13.16*/.form(action = routes.ClientiController.aggiungiServiziCliente())/*13.81*/ {_display_(Seq[Any](format.raw/*13.83*/("""
            """),format.raw/*14.13*/("""<div id="signup" class="row">

                """),_display_(/*16.18*/if(clienteServiziForm.hasErrors)/*16.50*/ {_display_(Seq[Any](format.raw/*16.52*/("""
                    """),format.raw/*17.21*/("""<p class="error">
                    """),_display_(/*18.22*/notice("error")/*18.37*/ {color =>_display_(Seq[Any](format.raw/*18.47*/(""" """),format.raw/*18.48*/("""<span style="color:red"> """),_display_(/*18.74*/clienteServiziForm/*18.92*/.globalError.message),format.raw/*18.112*/(""" """),format.raw/*18.113*/("""</span>""")))}),format.raw/*18.121*/("""
                    """),format.raw/*19.21*/("""</p>
                """)))}),format.raw/*20.18*/("""
                """),_display_(/*21.18*/inputText(
                    clienteServiziForm()
                )),format.raw/*23.18*/("""

                    """),format.raw/*25.21*/("""<!-- Checkboxes -->
                """),_display_(/*26.18*/checkbox(
                    clienteServiziForm("spa"),
                    '_label -> "SPA"
                )),format.raw/*29.18*/("""

                """),_display_(/*31.18*/checkbox(
                    clienteServiziForm("piscina"),
                    '_label -> "Piscina"
                )),format.raw/*34.18*/("""

                """),_display_(/*36.18*/checkbox(
                    clienteServiziForm("mass_relax"),
                    '_label -> "Massaggio relax"
                )),format.raw/*39.18*/("""

                """),_display_(/*41.18*/checkbox(
                    clienteServiziForm("mass_shiatsu"),
                    '_label -> "Massaggio shiatsu"
                )),format.raw/*44.18*/("""



                    """),format.raw/*48.21*/("""<!-- Button -->
                <div class="control-group">
                    <label class="control-label" for="submit"></label>

                    <div class="controls">
                        <button id="submit" name="submit" class="btn btn-primary">Salva</button>
                    </div>
                </div>

            """)))}),format.raw/*57.14*/("""
    """),format.raw/*58.5*/("""</div>

    </div>
    <br><br>

""")))}))}
  }

  def render(cliente:model.ClientiEntity,clienteServiziForm:Form[model.forms.ServiziClientiForm]): play.twirl.api.HtmlFormat.Appendable = apply(cliente,clienteServiziForm)

  def f:((model.ClientiEntity,Form[model.forms.ServiziClientiForm]) => play.twirl.api.HtmlFormat.Appendable) = (cliente,clienteServiziForm) => apply(cliente,clienteServiziForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 19:27:30 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/clienteServizi.scala.html
                  HASH: e2603ceb78b5caee0945476289e45fefcf5629b8
                  MATRIX: 782->1|1014->89|1042->151|1070->154|1102->178|1141->180|1175->187|1236->221|1251->227|1325->292|1365->294|1406->307|1481->355|1522->387|1562->389|1611->410|1677->449|1701->464|1749->474|1778->475|1831->501|1858->519|1900->539|1930->540|1970->548|2019->569|2072->591|2117->609|2207->678|2257->700|2321->737|2453->848|2499->867|2639->986|2685->1005|2836->1135|2882->1154|3037->1288|3089->1312|3456->1648|3488->1653
                  LINES: 26->1|31->1|33->6|35->8|35->8|35->8|38->11|40->13|40->13|40->13|40->13|41->14|43->16|43->16|43->16|44->17|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|46->19|47->20|48->21|50->23|52->25|53->26|56->29|58->31|61->34|63->36|66->39|68->41|71->44|75->48|84->57|85->58
                  -- GENERATED --
              */
          