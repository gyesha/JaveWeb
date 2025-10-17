package org.example.test;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s4")
public class Servlet4 extends HttpServlet {
    private String message;

    public void init() {
        message = "Servlet4";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");

        // Hello
        PrintWriter out = response.getWriter();
        out.println(message);

        //Session
        HttpSession session = request.getSession();//true
        out.println(session.getAttribute("message"));
        out.println(session.getAttribute("message2"));
        out.println(session.getAttribute("message2"));
        out.println(session.getId());

    }
}
