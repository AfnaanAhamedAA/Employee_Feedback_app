<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Feedback</h2>
<form action="/create" method="post">
<pre>
1.Name:<input type="text" name="name"/>
	<br>

2.Employee_Id:<input type="text" name="emp_id"/>
	<br>

3.How satisfied are you with your current role in the company?<br>
	<select name="current_role">
	  <option value=1>1</option>
	  <option value=2>2</option>
	  <option value=3>3</option>
	  <option value=4>4</option>
	  <option value=5>5</option>
	  <option value=6>6</option>
	  <option value=7>7</option>
	  <option value=8>8</option>
	  <option value=9>9</option>
	  <option value=10>10</option>
</select>
	<br>
4.How likely are you to recommend this company to a friend as a great place to work? <br>
	<select name="recomendation">
	  <option value=1>1</option>
	  <option value=2>2</option>
	  <option value=3>3</option>
	  <option value=4>4</option>
	  <option value=5>5</option>
	  <option value=6>6</option>
	  <option value=7>7</option>
	  <option value=8>8</option>
	  <option value=9>9</option>
	  <option value=10>10</option>
</select>
	<br>
	5.How do you rate the balance between your work and personal life?<br>
	<select name="balance_life">
	  <option value=1>1</option>
	  <option value=2>2</option>
	  <option value=3>3</option>
	  <option value=4>4</option>
	  <option value=5>5</option>
	  <option value=6>6</option>
	  <option value=7>7</option>
	  <option value=8>8</option>
	  <option value=9>9</option>
	  <option value=10>10</option>
</select>
	<br>
 6.How satisfied are you with the opportunities for growth and development within the company?
	<br><select name="growth">
	  <option value=1>1</option>
	  <option value=2>2</option>
	  <option value=3>3</option>
	  <option value=4>4</option>
	  <option value=5>5</option>
	  <option value=6>6</option>
	  <option value=7>7</option>
	  <option value=8>8</option>
	  <option value=9>9</option>
	  <option value=10>10</option>
</select>
	<br>
7. What do you like most about working at this company?<br><input type="text" name="about" />
	<br>
8.What could the company do to improve your happiness and engagement at work?<br>
	<input type="text" id="improve_happiness" name="improve_happiness" />
<br>
<input type="submit" value="Done"/>
</pre>
</form>
</body>
</html>