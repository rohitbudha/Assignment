<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doctor</title>
</head>
<body>
<p>Welcome to Doctors' site</p>
<hr>
Please kindly fill up the form below


<form action ="doctorServlet" method="post">

<p style=color:red> ${message}</p>
Name <input type="text" name="name"> <br><br>
EmailId <input type="text" name="email"><br><br>
Address <input type="text" name="address"><br><br>
Mobile <input type="number" name="mobile"><br><br>
Gender  
<input type="radio"  name="gender" value="male" > male<br><br>
 <input type="radio" name="gender" value="female" > female<br><br> 
Note<input type="text" name="note">		<br><br>
  <input type="submit" value="Create"><br><br>
  </form>


</body>
</html>