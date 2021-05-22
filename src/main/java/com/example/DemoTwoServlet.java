package com.example;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
    name = "DemoTwoServlet",
    value = "/DemoTwoServlet",
    initParams =
        {
            @WebInitParam(name = "Message", value = "Hello from ServletConfig to DemoTwoServlet"),
            @WebInitParam(name = "Command", value = "Select * from Department"),
        }
)
public class DemoTwoServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        ServletConfig config = getServletConfig();

        response.setContentType("text/html");
        out.println("<h3>Accessing Parameters Config from DemoTwoServlet</h3>");
        out.println("Message: "  + config.getInitParameter("Message"));
        out.println("<br/><br/>");
        out.println("Command: "  + config.getInitParameter("Command"));

        ServletContext context = getServletContext();
        out.println("<h3>Accessing Parameters of ServletContext in DemoTwoServlet</h3>");
        out.println("Driver: " + context.getInitParameter("Driver"));
        out.println("<br/><br/>");
        out.println("URL: " + context.getInitParameter("URL"));


    }
}
