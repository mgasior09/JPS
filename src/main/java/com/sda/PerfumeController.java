package com.sda;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PerfumeController", value = "/perfume")
public class PerfumeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String type = httpServletRequest.getParameter("type");
        if (type != null) {
            switch (type) {
                case "Channel":
                    httpServletResponse.getWriter().println(type + " No 5");
                    httpServletResponse.getWriter().println(type + " Gabrielle");
                    httpServletResponse.getWriter().println(type + " Coco Madameoiselle");
                    httpServletResponse.getWriter().println(type + " Coco Madameoiselle Intense");
                    break;

                case "Halloween":
                    httpServletResponse.getWriter().println(type + " Jesus Del Pozo");
                    httpServletResponse.getWriter().println(type + " Magic");
                    break;

                case "Fragonard":
                    httpServletResponse.getWriter().println(type + " Tilleul Cédra");
                    httpServletResponse.getWriter().println(type + " Jasmin Perle de Thé");
                    httpServletResponse.getWriter().println(type + " Rose Ambre");
                    break;

                default:
                    httpServletResponse.getWriter().println(type +  " typ nieprawidłowy");
                    break;
            }
        } else {
            httpServletResponse.getWriter().println("Nie podano typu");
        }
    }
}


