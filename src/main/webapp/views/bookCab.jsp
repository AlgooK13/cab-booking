<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cab Booking</title>
</head>
<body>
	<div class="container" align="center">
		<h2 class="title">Showing Drivers locations in the below Map</h2>
		<from action="/process-booking" id="booking">
		<div  class="container" align="center">
		<table>
		<tr><td>Source Location </td>
		<td><input type="text" name="sourceLocation" id="sourceLocation" placeholder="Source Location"></td>
		<tr><td>Destination Location </td>
		<td><input type="text" name="destLocation" id="destLocation" placeholder="Destination Location"></td> 
		</table>
		</div>
		<div id="googleMap" style="width: 100%; height: 400px"></div>
		<h1>Note: Assume driver position displayed according to the available driver list</h1>
		<button type="submit">Confirm Booking</button>
		</from>
	</div>
</body>
</html>