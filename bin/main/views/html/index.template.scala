
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import views.html._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-08-01T10:52:37.827055600
                  SOURCE: C:/Users/TANAY SALVE/Desktop/letsplay/app/views/index.scala.html
                  HASH: 058ec37dd4043fa6d444fe69f8252421d08bf266
                  MATRIX: 722->1|818->3|848->8|879->31|918->33|948->37|1005->65
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5
                  -- GENERATED --
              */
          