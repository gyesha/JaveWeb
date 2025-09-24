package org.example.test;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
    private String message;

    public void init() {
        message = "Servlet3";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");

        // Hello
        PrintWriter out = response.getWriter();
        out.println(message);

        //重定向 发送了两次请求 如果是/s2则是http://localhost:8080/
        // 重定向是客户端响应
        // response.sendRedirect("https://www.bilibili.com/"); 也可以
        response.sendRedirect("s2");

    }
}
