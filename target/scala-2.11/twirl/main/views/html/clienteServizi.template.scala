
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

        """),_display_(/*13.10*/helper/*13.16*/.form(action = routes.ClientiController.aggiungiServiziCliente(cliente.getId()))/*13.96*/ {_display_(Seq[Any](format.raw/*13.98*/("""
            """),format.raw/*14.13*/("""<div id="signup" class="row">

                """),_display_(/*16.18*/if(clienteServiziForm.hasErrors)/*16.50*/ {_display_(Seq[Any](format.raw/*16.52*/("""
                    """),format.raw/*17.21*/("""<p class="error">
                    """),_display_(/*18.22*/notice("error")/*18.37*/ {color =>_display_(Seq[Any](format.raw/*18.47*/(""" """),format.raw/*18.48*/("""<span style="color:red"> """),_display_(/*18.74*/clienteServiziForm/*18.92*/.globalError.message),format.raw/*18.112*/(""" """),format.raw/*18.113*/("""</span>""")))}),format.raw/*18.121*/("""
                    """),format.raw/*19.21*/("""</p>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- Checkboxes -->

                """),_display_(/*24.18*/checkbox(
                    field = clienteServiziForm("spa"),
                    '_label -> "SPA"
                )),format.raw/*27.18*/("""

                """),_display_(/*29.18*/checkbox(
                    field = clienteServiziForm("noloAccessori"),
                    '_label -> "Noleggio ciabatte ed accappatoio per SPA"
                )),format.raw/*32.18*/("""

                """),_display_(/*34.18*/checkbox(
                    field = clienteServiziForm("spa"),
                    '_label -> "SPA"
                )),format.raw/*37.18*/("""

                """),_display_(/*39.18*/checkbox(
                    field = clienteServiziForm("piscina"),
                    '_label -> "Piscina"
                )),format.raw/*42.18*/("""

                """),_display_(/*44.18*/checkbox(
                    field = clienteServiziForm("mass_relax"),
                    '_label -> "Massaggio relax"
                )),format.raw/*47.18*/("""

                """),_display_(/*49.18*/checkbox(
                    field = clienteServiziForm("mass_shiatsu"),
                    '_label -> "Massaggio shiatsu"
                )),format.raw/*52.18*/("""



                    """),format.raw/*56.21*/("""<!-- Button -->
                <div class="control-group">
                    <label class="control-label" for="submit"></label>

                    <div class="controls">
                        <button id="submit" name="submit" class="btn btn-primary">Salva</button>
                    </div>
                </div>

            """)))}),format.raw/*65.14*/("""
    """),format.raw/*66.5*/("""</div>

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
                  DATE: Fri Jul 17 01:32:38 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/clienteServizi.scala.html
                  HASH: 17a76f42bcf998888160b5e449bbb7fd0e3c7b9a
                  MATRIX: 782->1|1014->89|1042->151|1070->154|1102->178|1141->180|1175->187|1236->221|1251->227|1340->307|1380->309|1421->322|1496->370|1537->402|1577->404|1626->425|1692->464|1716->479|1764->489|1793->490|1846->516|1873->534|1915->554|1945->555|1985->563|2034->584|2087->606|2137->628|2202->666|2342->785|2388->804|2575->970|2621->989|2761->1108|2807->1127|2955->1254|3001->1273|3160->1411|3206->1430|3369->1572|3421->1596|3788->1932|3820->1937
                  LINES: 26->1|31->1|33->6|35->8|35->8|35->8|38->11|40->13|40->13|40->13|40->13|41->14|43->16|43->16|43->16|44->17|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|46->19|47->20|49->22|51->24|54->27|56->29|59->32|61->34|64->37|66->39|69->42|71->44|74->47|76->49|79->52|83->56|92->65|93->66
                  -- GENERATED --
              */
          