package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WelcomeServlet", value = "/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<h5>Welcome" + request.getParameter("username")+ " !!</h5>" );
    }
}
