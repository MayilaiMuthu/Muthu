<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruit Shop</title>
</head>
<body><center>
<h1>Fruit Shop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="shop2">
<input type="radio" name="apple" value="F1">Apple
<input type="radio" name="mango" value="F2">Mango
<input type="radio" name="banana" value="F3">Banana
<input type="submit" value="Next">
</form>
</center>
</body>
</html>