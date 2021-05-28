<%-- 
    Document   : ageCalculator
    Created on : May 26, 2021, 1:49:11 PM
    Author     : 844568
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <header> 
            <p>This magical calculator will tell you your age on your next birthday!</p>
        </header>
        <h1>Age Calculator</h1>


        <form method = "post" > 
            <label>Enter your age:  </label>
            <input type="number" name="age"  step="1" min="1" max="130" placeholder="1"> </input>
            <br>
            <input type="submit" value= "Age next birthdays"> </input>

            <p> Your age on your next birthday is ${ageNextBirthday}</p>

            <p>${error_message}</p>

            <a href="/lab03/arithmetic">arithmetic Calculator</a>
        </form>
    </body>
</html>
