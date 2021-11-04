<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="css/style.css" rel="stylesheet"/>
<title>Add Note</title>
</head>
<body>
	<div class="container-fluid p-0 m-0">
   		<%@include file="navbar.jsp" %>
   </div>
   <br>
   
   <div class="container">
   		<div class="container text-center"><h1>Add Note</h1></div>
   		<br>
   		<form action="SaveNote" method="post">
  			<div class="mb-3">
    			<label for="noteTitleText" class="form-label">Enter Note Title</label>
    			<input type="text" class="form-control" id="noteTitle" name="title" placeholder="Enter Note Title" required>
  			</div>
  			<div class="mb-3">
    			<label for="noteContentText" class="form-label">Enter Note Content</label>
    			<textarea id="noteContent" class="form-control" name="content" placeholder="Enter Your content" rows="7" required></textarea>
  			</div>
  			<div class="container text-center">
  				<button type="submit" class="btn btn-primary">Add Note</button>
  			</div>
		</form>
	</div>
</body>
</html>