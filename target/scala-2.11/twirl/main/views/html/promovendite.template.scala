
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
object promovendite extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.singleton.TopPromo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(promos: model.singleton.TopPromo):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import tags._
import helper._
import views.html.helper._

Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/main("Aggiungi Servizi")/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""


    """),format.raw/*11.5*/("""<div class="container">
        <div class="row_clearfix">

            <p>Nome promo: """),_display_(/*14.29*/promos/*14.35*/.nome),format.raw/*14.40*/("""</p>
            <p>Costo promo: """),_display_(/*15.30*/promos/*15.36*/.costo),format.raw/*15.42*/("""</p>
            <p>Numero Notti: """),_display_(/*16.31*/promos/*16.37*/.numNotti),format.raw/*16.46*/("""</p>
            <p>Tipo camera: """),_display_(/*17.30*/promos/*17.36*/.tipoCamera),format.raw/*17.47*/("""</p>

            <table class="table table-nonfluid">
                <tr>
                    <th>Servizi inclusi</th>

                </tr>
                """),_display_(/*24.18*/for(str <- promos.servizi) yield /*24.44*/{_display_(Seq[Any](format.raw/*24.45*/("""
                    """),format.raw/*25.21*/("""<tr>
                        <td>"""),_display_(/*26.30*/str),format.raw/*26.33*/("""</td>
                    </tr>
                """)))}),format.raw/*28.18*/("""
            """),format.raw/*29.13*/("""</table>
        </div>
    </div>

""")))}))}
  }

  def render(promos:model.singleton.TopPromo): play.twirl.api.HtmlFormat.Appendable = apply(promos)

  def f:((model.singleton.TopPromo) => play.twirl.api.HtmlFormat.Appendable) = (promos) => apply(promos)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jul 17 01:21:15 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/promovendite.scala.html
                  HASH: 0750a179afd1dec05f94e108ff7d0433be3490f1
                  MATRIX: 748->1|926->35|954->97|982->100|1014->124|1053->126|1087->133|1202->221|1217->227|1243->232|1304->266|1319->272|1346->278|1408->313|1423->319|1453->328|1514->362|1529->368|1561->379|1749->540|1791->566|1830->567|1879->588|1940->622|1964->625|2044->674|2085->687
                  LINES: 26->1|31->1|33->6|35->8|35->8|35->8|38->11|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|51->24|51->24|51->24|52->25|53->26|53->26|55->28|56->29
                  -- GENERATED --
              */
          