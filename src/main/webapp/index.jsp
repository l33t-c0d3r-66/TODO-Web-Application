<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="css/style.css" rel="stylesheet"/>
    <title>TODO Home</title>
  </head>
  <body>
   <div class="container-fluid p-0 m-0">
   		<%@include file="navbar.jsp" %>
   </div>
   <br>
   <div class="container text-center nav-color">
   		<h1>Home Page</h1><br>
   		<div class="card bg-primary">
   			<div class="container text-center">
  				<img src="icons/note.png" class="card-img-top" alt="Notes Application" style="width:400px; height:400px">
  			</div>
  			<div class="card-body text-center p-3">
    			<a href="Add.jsp" class="btn btn-danger">Get Started</a>
  			</div>
		</div>
	</div>
  </body>
</html>