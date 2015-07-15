
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
object clienti extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[model.ClientiEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clienteForm: Form[model.ClientiEntity]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import tags._
import helper._
import views.html.helper._

Seq[Any](format.raw/*1.42*/("""

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

  def render(clienteForm:Form[model.ClientiEntity]): play.twirl.api.HtmlFormat.Appendable = apply(clienteForm)

  def f:((Form[model.ClientiEntity]) => play.twirl.api.HtmlFormat.Appendable) = (clienteForm) => apply(clienteForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 02:21:27 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/clienti.scala.html
                  HASH: aa96dbbed4d4602d167a1118db9a8aac4db7700c
                  MATRIX: 744->1|928->41|956->103|984->106|1016->130|1055->132|1089->139|1150->173|1165->179|1232->237|1272->239|1313->252|1388->300|1422->325|1462->327|1511->348|1577->387|1601->402|1649->412|1678->413|1731->439|1751->450|1793->470|1823->471|1863->479|1912->500|1965->522|2015->544|2078->580|2214->695|2260->714|2394->827|2440->846|2568->953|2614->972|2752->1089|2798->1108|2928->1217|2974->1236|3100->1341|3146->1360|3284->1477|3334->1499|3701->1835|3733->1840
                  LINES: 26->1|31->1|33->6|35->8|35->8|35->8|38->11|40->13|40->13|40->13|40->13|41->14|43->16|43->16|43->16|44->17|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|46->19|47->20|49->22|50->23|53->26|55->28|58->31|60->33|63->36|65->38|68->41|70->43|73->46|75->48|78->51|80->53|83->56|85->58|94->67|95->68
                  -- GENERATED --
              */
          