/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 844568
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userAge = request.getParameter("age");

        request.setAttribute("Age", userAge);

        if (!isNumeric(userAge)) {
            request.setAttribute("message", "Invalid entry.Please enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }

        int ageValue = Integer.parseInt(userAge);
        request.setAttribute("ageNextBirthday", ++ageValue);

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

    }

    public static boolean isNumeric(String value) {
        double numberValue;

        if (value == null || value.equals("")) {
            System.out.println("The value that the user entered is null or empty");
            return false;
        }
        try {
            numberValue = Double.parseDouble(value);
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("The entery cannot be parsed to an integer");
        }
        return false;
    }

}
