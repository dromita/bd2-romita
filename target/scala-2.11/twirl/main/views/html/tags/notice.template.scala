
package views.html.tags

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
object notice extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,_root_.scala.Function1[String, Html],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(level: String = "error")(body: (String) => Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.51*/("""

"""),_display_(/*3.2*/level/*3.7*/ match/*3.13*/ {/*5.1*/case "success" =>/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""
"""),format.raw/*6.1*/("""<p class="success">
    """),_display_(/*7.6*/body("green")),format.raw/*7.19*/("""
"""),format.raw/*8.1*/("""</p>
""")))}/*11.1*/case "warning" =>/*11.18*/ {_display_(Seq[Any](format.raw/*11.20*/("""
"""),format.raw/*12.1*/("""<p class="warning">
    """),_display_(/*13.6*/body("orange")),format.raw/*13.20*/("""
"""),format.raw/*14.1*/("""</p>
""")))}/*17.1*/case "error" =>/*17.16*/ {_display_(Seq[Any](format.raw/*17.18*/("""
"""),format.raw/*18.1*/("""<p class="error">
    """),_display_(/*19.6*/body("red")),format.raw/*19.17*/("""
"""),format.raw/*20.1*/("""</p>
""")))}}))}
  }

  def render(level:String,body:_root_.scala.Function1[String, Html]): play.twirl.api.HtmlFormat.Appendable = apply(level)(body)

  def f:((String) => (_root_.scala.Function1[String, Html]) => play.twirl.api.HtmlFormat.Appendable) = (level) => (body) => apply(level)(body)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 02:21:28 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/tags/notice.scala.html
                  HASH: 964db68d64140d151d8adb830af7dd78bc68ccda
                  MATRIX: 766->1|903->50|931->53|943->58|957->64|966->68|991->85|1030->87|1057->88|1107->113|1140->126|1167->127|1191->135|1217->152|1257->154|1285->155|1336->180|1371->194|1399->195|1423->203|1447->218|1487->220|1515->221|1564->244|1596->255|1624->256
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->5|31->5|31->5|32->6|33->7|33->7|34->8|35->11|35->11|35->11|36->12|37->13|37->13|38->14|39->17|39->17|39->17|40->18|41->19|41->19|42->20
                  -- GENERATED --
              */
          