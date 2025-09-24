package org.example.test;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

       //request.getParameter();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("asd");

        String usename = request.getParameter("use");
        String password = request.getParameter("pass");
        out.println("usename: " + usename);
        out.println("password: " + password);
        out.println(request.getContentType());
        out.println(request.getContextPath());
        out.println(request.getServletPath());
        out.println(request.getRequestURL());
    }

    public void destroy() {
    }
}