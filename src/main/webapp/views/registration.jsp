<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book a Cab- Fast & Easy</title>
<link rel="stylesheet" href="css/booking.css"/>
</head>
<body>
<script src="js/jquery.min.js"></script>
<script src="js/validation.js"></script>
<div class="container" align="center">
  <h2 class="title">Book a Cab- Fast & Easy</h2>
  <form action="/find-driver" name="registration">
<table>
    <tr><td><label for="firstname">First Name</label></td>
    <td><input type="text" name="firstname" id="firstname" placeholder="First Name"></td></tr>

   <tr><td> <label for="lastname">Last Name</label></td>
   <td> <input type="text" name="lastname" id="lastname" placeholder="Last Name"></td></tr>
 	
 	<tr><td> <label for="mobile">Mobile</label></td>
    <td><input type="text" name="mobile" id="mobile" placeholder="+91 1234567890"></td></tr>

    <tr><td> <label for="email">Email</label></td>
    <td><input type="email" name="email" id="email" placeholder="abc@test.com"></td></tr>

   <tr><td>  <label for="password">Password</label></td>
    <td><input type="password" name="password" id="password" placeholder="Password"></td></tr>
 </table>
   <button type="submit">Register & Book</button>
  </form>
</div>

</body>
</html>