package sv.edu.udb.guia7;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = "/hello-servlet")
public class HelloServlet extends HttpServlet {


  @Override
  protected void doPost(final HttpServletRequest request,
                        final HttpServletResponse response)
        throws ServletException, IOException {
      final String num_1 = request.getParameter("num_1");
      final String num_2 = request.getParameter("num_2");

      try{
          final Double sum = sumNumbers(Double.valueOf(num_1),
                  Double.valueOf(num_2));
          request.setAttribute("respuesta", sum);
          request
                  .getRequestDispatcher("index.jsp")
                  .forward(request, response);
    }catch (Exception e){
          request
                  .getRequestDispatcher("index.jsp")
                  .forward(request, response);
      }
  }

  private Double sumNumbers(final Double num1, final Double num2) {
      return num1 - num2;
  }


    public void destroy() {
    }
}