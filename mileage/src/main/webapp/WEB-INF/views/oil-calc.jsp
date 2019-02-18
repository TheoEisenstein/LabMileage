<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oil Change</title>
</head>
<body>
<p>Time to figure out how much oil you need to buy, and then how much to recycle!<br>
Oil is only solid in five gallon containers. Let's find out how you'll need to buy and then how much you need to recycle!</p>
	<form action="/oil-calc-result">
		<p>Enter how much oil you need! <input type="number" name="oilGallons" /> </p>
		<p><button type="submit">Calculate</button></p>
	</form>


</body>
</html>