package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "LottoController", value = "/lotto")
public class LottoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String stringNumber = httpServletRequest.getParameter("number");
        try {
            int number = Integer.parseInt(stringNumber);
            int randomNumber = new Random().nextInt(11);
            if (number == randomNumber) {
                httpServletResponse.getWriter().println("YOU HAVE WON!!!!!");
            } else {
                httpServletResponse.getWriter().println("TRY AGAIN");
            }
        } catch (NumberFormatException e) {
            httpServletResponse.getWriter().println("Incorrect format");
        }
    }
}
