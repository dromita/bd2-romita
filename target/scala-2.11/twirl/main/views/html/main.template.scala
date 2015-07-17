
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


<div class="content">
    """),_display_(/*42.6*/content),format.raw/*42.13*/("""
"""),format.raw/*43.1*/("""</div>

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
                  DATE: Fri Jul 17 01:21:15 CEST 2015
                  SOURCE: D:/typesafe_activator/activator-dist-1.3.5/bd2-romita/app/views/main.scala.html
                  HASH: 7d1ca5c57a48cb78284f0e491a74510b57fb758e
                  MATRIX: 727->1|845->31|872->32|940->74|965->79|1375->461|1404->462|1445->475|1520->523|1549->524|1581->529|2496->1418|2524->1425|2552->1426
                  LINES: 26->1|29->1|30->2|33->5|33->5|41->13|41->13|42->14|44->16|44->16|45->17|70->42|70->42|71->43
                  -- GENERATED --
              */
          