
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
object clientiView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[model.ClientiEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clients: List[model.ClientiEntity]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Mostra clienti")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

  """),format.raw/*5.3*/("""<div class="container">
    <div class="row_clearfix">

      <table class="table table-nonfluid">
        <tr>
          <th>Nome</th>
          <th>Cognome</th>

        </tr>
        """),_display_(/*14.10*/for(client <- clients) yield /*14.32*/{_display_(Seq[Any](format.raw/*14.33*/("""
          """),format.raw/*15.11*/("""<tr>
            <td>"""),_display_(/*16.18*/client/*16.24*/.getNome),format.raw/*16.32*/("""</td>
            <td>"""),_display_(/*17.18*/client/*17.24*/.getCognome),format.raw/*17.35*/("""</td>
          </tr>
        """)))}),format.raw/*19.10*/("""
      """),format.raw/*20.7*/("""</table>
    </div>
  </div>

""")))}),format.raw/*24.2*/("""

"""))}
  }

  def render(clients:List[model.ClientiEntity]): play.twirl.api.HtmlFormat.Appendable = apply(clients)

  def f:((List[model.ClientiEntity]) => play.twirl.api.HtmlFormat.Appendable) = (clients) => apply(clients)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 17:51:30 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/clientiView.scala.html
                  HASH: 18bd5c8fd4c82dd33ffc88b02572a15e4e7bb431
                  MATRIX: 748->1|872->37|902->42|932->64|971->66|1003->72|1226->268|1264->290|1303->291|1343->303|1393->326|1408->332|1437->340|1488->364|1503->370|1535->381|1599->414|1634->422|1699->457
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|42->14|42->14|42->14|43->15|44->16|44->16|44->16|45->17|45->17|45->17|47->19|48->20|52->24
                  -- GENERATED --
              */
          