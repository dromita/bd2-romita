
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
object promoNuova extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[model.forms.PromoServiziForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(promoServiziForm: Form[model.forms.PromoServiziForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import tags._
import helper._
import views.html.helper._

Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/main("Aggiungi Servizi")/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""


    """),format.raw/*11.5*/("""<div class="container">

        """),_display_(/*13.10*/helper/*13.16*/.form(action = routes.PromozioniController.aggiungiPromoServizi())/*13.82*/ {_display_(Seq[Any](format.raw/*13.84*/("""
            """),format.raw/*14.13*/("""<div id="signup" class="row">

                """),_display_(/*16.18*/if(promoServiziForm.hasErrors)/*16.48*/ {_display_(Seq[Any](format.raw/*16.50*/("""
                    """),format.raw/*17.21*/("""<p class="error">
                    """),_display_(/*18.22*/notice("error")/*18.37*/ {color =>_display_(Seq[Any](format.raw/*18.47*/(""" """),format.raw/*18.48*/("""<span style="color:red"> """),_display_(/*18.74*/promoServiziForm/*18.90*/.globalError.message),format.raw/*18.110*/(""" """),format.raw/*18.111*/("""</span>""")))}),format.raw/*18.119*/("""
                    """),format.raw/*19.21*/("""</p>
                """)))}),format.raw/*20.18*/("""

                    """),format.raw/*22.21*/("""<!-- Text input -->

                """),_display_(/*24.18*/inputText(
                    promoServiziForm("nome"),
                    '_label -> "Nome promozione"
                )),format.raw/*27.18*/("""

                """),_display_(/*29.18*/inputText(
                    promoServiziForm("sitoweb"),
                    '_label -> "Sito web sponsorizzante"
                )),format.raw/*32.18*/("""

                """),_display_(/*34.18*/inputText(
                    promoServiziForm("costo"),
                    '_label -> "Prezzo promozione"
                )),format.raw/*37.18*/("""

                """),_display_(/*39.18*/inputText(
                    promoServiziForm("numNotti"),
                    '_label -> "Numero pernottamenti inclusi"
                )),format.raw/*42.18*/("""

                    """),format.raw/*44.21*/("""<!-- Checkboxes -->

                """),_display_(/*46.18*/checkbox(
                    field = promoServiziForm("spa"),
                    '_label -> "SPA"
                )),format.raw/*49.18*/("""
                """),_display_(/*50.18*/inputText(
                    promoServiziForm("q_spa"),
                    '_label -> "Numero trattamenti SPA inclusi"
                )),format.raw/*53.18*/("""

                """),_display_(/*55.18*/checkbox(
                    field = promoServiziForm("piscina"),
                    '_label -> "Piscina"
                )),format.raw/*58.18*/("""
                """),_display_(/*59.18*/inputText(
                    promoServiziForm("q_piscina"),
                    '_label -> "Numero trattamenti piscina inclusi"
                )),format.raw/*62.18*/("""

                """),_display_(/*64.18*/checkbox(
                    field = promoServiziForm("mass_relax"),
                    '_label -> "Massaggio relax"
                )),format.raw/*67.18*/("""
                """),_display_(/*68.18*/inputText(
                    promoServiziForm("q_mass_relax"),
                    '_label -> "Numero massaggi relax inclusi"
                )),format.raw/*71.18*/("""

                """),_display_(/*73.18*/checkbox(
                    field = promoServiziForm("mass_shiatsu"),
                    '_label -> "Massaggio shiatsu"
                )),format.raw/*76.18*/("""
                """),_display_(/*77.18*/inputText(
                    promoServiziForm("q_mass_shiatsu"),
                    '_label -> "Numero massaggi shiatsu inclusi"
                )),format.raw/*80.18*/("""



                    """),format.raw/*84.21*/("""<!-- Button -->
                <div class="control-group">
                    <label class="control-label" for="submit"></label>

                    <div class="controls">
                        <button id="submit" name="submit" class="btn btn-primary">Salva</button>
                    </div>
                </div>

            """)))}),format.raw/*93.14*/("""
    """),format.raw/*94.5*/("""</div>

    </div>
    <br><br>

""")))}))}
  }

  def render(promoServiziForm:Form[model.forms.PromoServiziForm]): play.twirl.api.HtmlFormat.Appendable = apply(promoServiziForm)

  def f:((Form[model.forms.PromoServiziForm]) => play.twirl.api.HtmlFormat.Appendable) = (promoServiziForm) => apply(promoServiziForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 21:05:44 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/promoNuova.scala.html
                  HASH: 3f88db4d3f87bab9c7000afd03c044ff6ffaecee
                  MATRIX: 756->1|954->55|982->117|1010->120|1042->144|1081->146|1115->153|1176->187|1191->193|1266->259|1306->261|1347->274|1422->322|1461->352|1501->354|1550->375|1616->414|1640->429|1688->439|1717->440|1770->466|1795->482|1837->502|1867->503|1907->511|1956->532|2009->554|2059->576|2124->614|2268->737|2314->756|2469->890|2515->909|2662->1035|2708->1054|2869->1194|2919->1216|2984->1254|3122->1371|3167->1389|3327->1528|3373->1547|3519->1672|3564->1690|3732->1837|3778->1856|3935->1992|3980->2010|4146->2155|4192->2174|4353->2314|4398->2332|4568->2481|4620->2505|4987->2841|5019->2846
                  LINES: 26->1|31->1|33->6|35->8|35->8|35->8|38->11|40->13|40->13|40->13|40->13|41->14|43->16|43->16|43->16|44->17|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|46->19|47->20|49->22|51->24|54->27|56->29|59->32|61->34|64->37|66->39|69->42|71->44|73->46|76->49|77->50|80->53|82->55|85->58|86->59|89->62|91->64|94->67|95->68|98->71|100->73|103->76|104->77|107->80|111->84|120->93|121->94
                  -- GENERATED --
              */
          