package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestController", value = "/test")
public class TestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        for (int i = 1; i <= 100; i++) {
            httpServletResponse.getWriter().print(i + " ");
            if (i % 10 == 0) {
                httpServletResponse.getWriter().println();
            }
        }
    }
}
