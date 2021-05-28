package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AirthmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstNumber = request.getParameter("first_number");
        String secondNumber = request.getParameter("second_number");

        //request.setAttribute("Age", userAge);
        if (!isNumeric(firstNumber) || !isNumeric(secondNumber)) {
            request.setAttribute("message", "Invalid entry.Please enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }

        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);

        String plus = request.getParameter("plus");
        String minus = request.getParameter("minus");
        String multiply = request.getParameter("multiply");
        String divide = request.getParameter("divide");

        double result = 0;
        if (plus != null) {
            result = first + second;
        } else if (minus != null) {
            result = first - second;
        } else if (multiply != null) {
            result = first * second;
        } else if (divide != null) {
            result = first / second;
        }

        request.setAttribute("calculationResult", result);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);

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
