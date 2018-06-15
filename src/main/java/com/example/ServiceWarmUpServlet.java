package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServiceWarmUpServlet extends HttpServlet {

    private static final long serialVersionUID = 558603916526509215L;

    @Override
    public void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {
        System.out.println("Warming up");
    }
}
