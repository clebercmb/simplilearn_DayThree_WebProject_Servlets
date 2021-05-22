package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        RequestDispatcher  rd = null;
        if( userName.equals("admin") && password.equals("123456") ) {
            //out.println("<h4>Logged in  Successfully </h4>");
            rd = request.getRequestDispatcher("WelcomeServlet");
            rd.forward(request, response);

        } else {
            //out.println("<h4>Invalid Credentials </4>");
            rd = request.getRequestDispatcher("login.jsp");
            rd.include(request, response);
            out.println("<h4 style='color:red'> Invalid Credentials </h4");
            //out.println("<h4>Invalid Credentials. Please Try Again</h4>");
        }
    }
}
