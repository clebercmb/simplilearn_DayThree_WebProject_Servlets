package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
    name = "DemoOneServlet",
    value = "/DemoOneServlet",
    initParams =
        {
                @WebInitParam(name = "Message", value = "Hello from ServletConfig to DemoOneServlet"),
                @WebInitParam(name = "Command", value = "Select * from Employees"),
        }
)
public class DemoOneServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        ServletConfig config = getServletConfig();

        response.setContentType("text/html");
        out.println("<h3>Accessing Parameters Config from DemoOneServlet</h3>");
        out.println("Message: "  + config.getInitParameter("Message"));
        out.println("<br/><br/>");
        out.println("Command: "  + config.getInitParameter("Command"));

        ServletContext context = getServletContext();
        out.println("<h3>Accessing Parameters of ServletContext in DemoOneServlet</h3>");
        out.println("Driver: " + context.getInitParameter("Driver"));
        out.println("<br/><br/>");
        out.println("URL: " + context.getInitParameter("URL"));
    }
}
