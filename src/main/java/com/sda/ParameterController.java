package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ParameterController", value = "/param")
public class ParameterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String name = httpServletRequest.getParameter("name");
        String surname = httpServletRequest.getParameter("surname");
        httpServletResponse.getWriter().println("Hello, " + name + " " + surname);
    }
}
