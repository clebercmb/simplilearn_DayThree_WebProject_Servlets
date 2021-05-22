package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {

    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("Service method invoked");

        out.println(username);

    }*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.println("<h4>Service method GET invoked</h4>");

        out.println("<h5>Hello "+username+" !!</h5>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.println("<h4>Service method POST invoked</h4>");

        out.println("<h5>Hello "+username+" !!</h5>");

    }
}
