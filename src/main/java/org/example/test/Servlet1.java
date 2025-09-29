package org.example.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
    private String message;

    public void init() {
        message = "Servlet1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println(message + "123");


        Cookie cookie = new Cookie("username", "ccc");
        cookie.setMaxAge(3600); // 1小时
        cookie.setPath("/"); // 整个站点可用
        cookie.setHttpOnly(true); // 防止 XSS
        cookie.setSecure(true); // 如果是 HTTPS 站点
        response.addCookie(cookie);



/*

        //转发到s2
        request.setAttribute("a", message);
        RequestDispatcher rd = request.getRequestDispatcher("s2");//分配到s2
        rd.forward(request,response);
        //rd.include(request,response);
*/


    }
}
