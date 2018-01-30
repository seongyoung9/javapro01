<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8" /> 
    <style>
        table, td, th { border: 1px solid green; }        
        th { background-color: green; color: white; }
    </style>
</head>
<body>
    <form action="/phone/writeone" method="post"  enctype="application/x-www-form-urlencoded">
        <input type="text" name="name"  size="50" placeholder="폰 이름" required="required" /> <br> 
        <input type="text" name="manufacturer" size="50" placeholder="폰 제조사" required="required"/> <br> 
        <input type="number" name="price" size="50" placeholder="폰 가격" required="required" /> <br>     
        <input type="submit" id="writeone2" value="@RequestParam" /> <br/>
    </form>
</body>
</html>
