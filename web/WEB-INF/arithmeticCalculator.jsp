<%-- 
    Document   : arithmeticCalculator
    Created on : May 26, 2021, 1:51:01 PM
    Author     : 844568
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <header> 
            <p>This  calculator lets the user add, multiply, subtract and divide!</p>
        </header>
        <h1>Arithmetic Calculator</h1>


        <form method = "post" > 
            <label>First </label>
            <input type="number" name="first_number"  step="1"  placeholder="1"> </input>
            <br>

            <label>Second </label>
            <input type="number" name="second_number"  step="1"  placeholder="1"> </input>
            <br>



            <input type="submit" value= "+" name="plus"> </input>
            <input type="submit" value= "-" name="minus"> </input>
            <input type="submit" value= "x" name="multiply"> </input>
            <input type="submit" value= "%" name="divide"> </input>

            <p> Result ${calculationResult}</p>

            <p>${error_message}</p>

            <a href="./ageCalculator.jsp">Age calculator</a>
        </form>
    </body>
</html>
