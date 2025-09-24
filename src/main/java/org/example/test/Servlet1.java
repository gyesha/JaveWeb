package org.example.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
    private String message;

    public void init() {
        message = "Servlet1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/plain");

        // Hello
        PrintWriter out = response.getWriter();
        out.println(message + "123");

        request.setAttribute("a", message);
        RequestDispatcher rd = request.getRequestDispatcher("s2");//分配到s2
        rd.forward(request,response);
        //rd.include(request,response);
    }
}
