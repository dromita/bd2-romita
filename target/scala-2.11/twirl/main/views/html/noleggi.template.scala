
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
object noleggi extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.lang.Long,java.lang.Double,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(noleggi: java.lang.Long, perm_media: java.lang.Double):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/main("Numero noleggi")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

    """),format.raw/*5.5*/("""<div class="container">
        <div class="row_clearfix">

            <p>Numero totale di noleggi: """),_display_(/*8.43*/noleggi),format.raw/*8.50*/("""</p>
            <p>Permanenza media dei clienti nelle camere: """),_display_(/*9.60*/perm_media),format.raw/*9.70*/("""</p>

        </div>
    </div>

""")))}),format.raw/*14.2*/("""
"""))}
  }

  def render(noleggi:java.lang.Long,perm_media:java.lang.Double): play.twirl.api.HtmlFormat.Appendable = apply(noleggi,perm_media)

  def f:((java.lang.Long,java.lang.Double) => play.twirl.api.HtmlFormat.Appendable) = (noleggi,perm_media) => apply(noleggi,perm_media)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 21:54:28 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/noleggi.scala.html
                  HASH: e41db68e2e21e77f081f8cf00f50e45155643d82
                  MATRIX: 750->1|893->56|921->59|951->81|990->83|1022->89|1150->191|1177->198|1267->262|1297->272|1361->306
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|36->8|36->8|37->9|37->9|42->14
                  -- GENERATED --
              */
          