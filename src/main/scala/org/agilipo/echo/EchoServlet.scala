package org.agilipo.echo

import javax.servlet.http._
import javax.servlet._

class EchoServlet extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) =
    response.getWriter().println(exampleContent)

  def exampleContent(): String = { "Hello World, from a Scala Servlet!" }


}
