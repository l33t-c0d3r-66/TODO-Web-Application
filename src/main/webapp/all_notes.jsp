<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.hibernate.Session"%>
<%@ page import="org.hibernate.Query"%>
<%@ page import="java.util.List"%>
<%@page import="com.util.FactoryProvider"%>
<%@page import="com.entities.Note"%>
<!DOCTYPE html>
<html>
<head>
	<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="css/style.css" rel="stylesheet"/>
<title>All Notes</title>
</head>
<body>
	<div class="container-fluid p-0 m-0">
   		<%@include file="navbar.jsp" %>
   </div>
   <br>
   <div class="container">
   		<div class="container text-center"><h1>All Notes</h1></div>
   				<%
   					int i = 0;
   					Session s = FactoryProvider.getSessionFactory().openSession();
   					Query<Note> query = s.createQuery("from Note");
   					List<Note> listOfNotes = query.list();
   					for(Note note: listOfNotes) {
   						if(i%2 == 0) {
   				%>
   							<div class="container m-0 p-0">
   								<div class="row">
   			 	<%       } 	
   			 	%>
  									<div class="col-md-6 d-flex">
  										<div class="card-body mt-1" style="border: 2px solid #FD7272">
  											<div class = "container text-center p-1">
  												<img class="card-img-top text-center" src="icons/note.png" alt="Card image cap" style="width:100px; height:100px">
  											</div>
    										<h3 class="card-header text-center"><% out.println(note.getNoteTitle()); %></h3>
    										<p class="card-text p-1"><% out.println(note.getNoteContent()); %></p>
    										<div class = "container text-center p-1">
    											<a href="edit_note.jsp?note_id=<%= note.getNoteId() %>" class="btn btn-primary">Update</a>
    											<a href="DeleteNote?note_id=<%= note.getNoteId() %>" class="btn btn-danger">Delete</a>
    										</div>
  										</div>
									</div>
				<%
						if(i%2!=0) {
							
				%>
								</div>
							</div>
   				<%
					}
					i++;
   				}
   				s.close();
   		
   				%>
   	</div>
   	</div>
</body>
</html>