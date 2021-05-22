package com.example.filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(
    filterName = "ValidationFilter",
    servletNames = {"RegisterServlet"}
)
public class ValidationFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        System.out.println("Hello from ValidationFilter");

        String pan = request.getParameter("pan");

        if(pan == null || !pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            request.getRequestDispatcher("registration.jsp").include(request, response);
            out.println("<h4 style='color:red'>Invalid PAN number...</h4>");

        } else {
            request.setAttribute("pan", pan);
            chain.doFilter(request, response);
        }

    }
}
