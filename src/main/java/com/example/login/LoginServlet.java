package com.example.login;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {


String username = request.getParameter("username");
String password = request.getParameter("password");


response.setContentType("text/html");
PrintWriter out = response.getWriter();


if ("admin".equals(username) && "password".equals(password)) {
RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
rd.forward(request, response);
} else {
out.println("<h3>Invalid credentials, please try again!</h3>");
RequestDispatcher rd = request.getRequestDispatcher("login.html");
rd.include(request, response);
}
}
}