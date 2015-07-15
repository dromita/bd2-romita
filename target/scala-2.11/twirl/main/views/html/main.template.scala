
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*5.13*/title),format.raw/*5.18*/("""</title>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap-theme.min.css">
    <style>
        footer """),format.raw/*13.16*/("""{"""),format.raw/*13.17*/("""
            """),format.raw/*14.13*/("""position: fixed;
            bottom: 0;
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/("""
    """),format.raw/*17.5*/("""</style>
    <!-- Latest compiled and minified JavaScript -->
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"></script>
    <!--datatables-->

    <script src="//cdn.datatables.net/1.10.0/js/jquery.dataTables.min.js"></script>


</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>

    </div>

    """),format.raw/*40.78*/("""
    """),format.raw/*41.81*/("""

        """),format.raw/*43.53*/("""
            """),format.raw/*44.53*/("""
            """),format.raw/*45.38*/("""
                """),format.raw/*46.104*/("""
                """),format.raw/*47.47*/("""
                    """),format.raw/*48.71*/("""
                    """),format.raw/*49.76*/("""
                    """),format.raw/*50.57*/("""



                """),format.raw/*54.26*/("""
            """),format.raw/*55.22*/("""
        """),format.raw/*56.18*/("""
    """),format.raw/*57.15*/("""
    """),format.raw/*58.35*/("""
"""),format.raw/*59.1*/("""</nav>

<div class="content">
    """),_display_(/*62.6*/content),format.raw/*62.13*/("""
"""),format.raw/*63.1*/("""</div>

<footer>
    <div class="container">
        <p class="muted credit"> Damiano Romita
        </p>
    </div>
</footer>

</body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 18:03:45 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/main.scala.html
                  HASH: 5845e3425ade233bbacf8d22d85df4d5c51198f8
                  MATRIX: 727->1|845->31|872->32|940->74|965->79|1375->461|1404->462|1445->475|1520->523|1549->524|1581->529|2474->1467|2507->1548|2545->1602|2586->1655|2627->1693|2673->1797|2718->1844|2767->1915|2816->1991|2865->2048|2913->2077|2954->2099|2991->2117|3024->2132|3057->2167|3085->2168|3146->2203|3174->2210|3202->2211
                  LINES: 26->1|29->1|30->2|33->5|33->5|41->13|41->13|42->14|44->16|44->16|45->17|68->40|69->41|71->43|72->44|73->45|74->46|75->47|76->48|77->49|78->50|82->54|83->55|84->56|85->57|86->58|87->59|90->62|90->62|91->63
                  -- GENERATED --
              */
          