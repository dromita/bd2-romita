
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
object clienti extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[model.forms.ClienteForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clienteForm: Form[model.forms.ClienteForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import tags._
import helper._
import views.html.helper._

Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/main("Aggiungi Cliente")/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""


    """),format.raw/*11.5*/("""<div class="container">

        """),_display_(/*13.10*/helper/*13.16*/.form(action = routes.ClientiController.aggiungiCliente())/*13.74*/ {_display_(Seq[Any](format.raw/*13.76*/("""
            """),format.raw/*14.13*/("""<div id="signup" class="row">

                """),_display_(/*16.18*/if(clienteForm.hasErrors)/*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""
                    """),format.raw/*17.21*/("""<p class="error">
                    """),_display_(/*18.22*/notice("error")/*18.37*/ {color =>_display_(Seq[Any](format.raw/*18.47*/(""" """),format.raw/*18.48*/("""<span style="color:red"> """),_display_(/*18.74*/clienteForm/*18.85*/.globalError.message),format.raw/*18.105*/(""" """),format.raw/*18.106*/("""</span>""")))}),format.raw/*18.114*/("""
                    """),format.raw/*19.21*/("""</p>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- Text input-->
                """),_display_(/*23.18*/inputText(
                    clienteForm("cf"),
                    '_label -> "Codice Fiscale"
                )),format.raw/*26.18*/("""

                """),_display_(/*28.18*/inputText(
                    clienteForm("cognome"),
                    '_label -> "Cognome"
                )),format.raw/*31.18*/("""

                """),_display_(/*33.18*/inputText(
                    clienteForm("nome"),
                    '_label -> "nome"
                )),format.raw/*36.18*/("""

                """),_display_(/*38.18*/inputText(
                    clienteForm("indirizzo"),
                    '_label -> "Indirizzo"
                )),format.raw/*41.18*/("""

                """),_display_(/*43.18*/inputText(
                    clienteForm("citta"),
                    '_label -> "Citt�"
                )),format.raw/*46.18*/("""

                """),_display_(/*48.18*/inputText(
                    clienteForm("cap"),
                    '_label -> "CAP"
                )),format.raw/*51.18*/("""

                """),_display_(/*53.18*/inputText(
                    clienteForm("provincia"),
                    '_label -> "Provincia"
                )),format.raw/*56.18*/("""

                    """),format.raw/*58.21*/("""<!-- Button -->
                <div class="control-group">
                    <label class="control-label" for="submit"></label>

                    <div class="controls">
                        <button id="submit" name="submit" class="btn btn-primary">Salva</button>
                    </div>
                </div>

            """)))}),format.raw/*67.14*/("""
    """),format.raw/*68.5*/("""</div>

    </div>
    <br><br>

""")))}))}
  }

  def render(clienteForm:Form[model.forms.ClienteForm]): play.twirl.api.HtmlFormat.Appendable = apply(clienteForm)

  def f:((Form[model.forms.ClienteForm]) => play.twirl.api.HtmlFormat.Appendable) = (clienteForm) => apply(clienteForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 14:24:58 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/clienti.scala.html
                  HASH: 24222182e3ef4044c4761ccb595c25f2389d4e3b
                  MATRIX: 748->1|936->45|964->107|992->110|1024->134|1063->136|1097->143|1158->177|1173->183|1240->241|1280->243|1321->256|1396->304|1430->329|1470->331|1519->352|1585->391|1609->406|1657->416|1686->417|1739->443|1759->454|1801->474|1831->475|1871->483|1920->504|1973->526|2023->548|2086->584|2222->699|2268->718|2402->831|2448->850|2576->957|2622->976|2760->1093|2806->1112|2936->1221|2982->1240|3108->1345|3154->1364|3292->1481|3342->1503|3709->1839|3741->1844
                  LINES: 26->1|31->1|33->6|35->8|35->8|35->8|38->11|40->13|40->13|40->13|40->13|41->14|43->16|43->16|43->16|44->17|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|46->19|47->20|49->22|50->23|53->26|55->28|58->31|60->33|63->36|65->38|68->41|70->43|73->46|75->48|78->51|80->53|83->56|85->58|94->67|95->68
                  -- GENERATED --
              */
          