package com.tivo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class helloworld extends HttpServlet {

   private static final long serialVersionUID = 1L;
public String str="Hello";

   @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
      resp.setContentType("text/plain");
      resp.getWriter().write(str);
      
      }
}
