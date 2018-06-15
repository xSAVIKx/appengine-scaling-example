package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1965556222901524975L;


    @Override
    public void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {
        System.out.println("Handling HelloWorld endpoint.");
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().append("<html><head><title>Test</title><body><p1>Hello World!</p1></body></html>");
    }
}
