package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CityController", value = "/cities", initParams = {
        @WebInitParam(name = "city", value = "London"),
        @WebInitParam(name = "times", value = "5"),
}, loadOnStartup = 1)


public class CityController extends HttpServlet {

    @Override
    public String getInitParameter(String param) {
        return super.getInitParameter(param);
    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.getWriter().println("I visited " + getInitParameter("city") + " " + getInitParameter("times") + " times");
    }
}
