/**
 * \file displayHelloServlet.java
 * \author Josué Teodoro Moreira
 * \date May 05, 2021
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class
displayHelloServlet extends HttpServlet
{
  public static String firstName;
  public static String lastName;

  protected void
  processRequest(HttpServletRequest  __request,
                 HttpServletResponse __response)
    throws ServletException, IOException
  {
    __response.setContentType("text/html;charset=UTF=8");
    try(PrintWriter pw = __response.getWriter())
    {
      this.firstName = __request.getParameter("first-name");
      this.lastName  = __request.getParameter("last-name");

      __request.setAttribute("first-name", this.firstName);
      __request.setAttribute("last-name", this.lastName);
      __request.getRequestDispatcher("./web/message.jsp").forward(__request, __response);
    }
  }

  @Override
  protected void
  doGet(HttpServletRequest  __request,
        HttpServletResponse __response)
    throws ServletException, IOException
  { processRequest(__request, __response); }

  @Override
  protected void
  doPost(HttpServletRequest  __request,
         HttpServletResponse __response)
    throws ServletException, IOException
  { processRequest(__request, __response); }
}
