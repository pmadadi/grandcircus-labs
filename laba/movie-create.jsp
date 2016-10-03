<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%--
	On this page we have a form to create a movie.
	
	Model:
	- Movie movie ~ a movie with no properties set at all
 --%>
<html>
<head>
<title>Movies</title>
<link href="<c:url value="/resources/main.css"/>" rel="stylesheet" />
</head>
<body>
	<div class="nav">
		<a href="<c:url value="/"/>">Home</a> <a
			href="<c:url value="/movies"/>">Back to Movies List</a>
	</div>
	<h1>Add a movie</h1>

	<form method="post">
		<div>
			<label>Title</label> <input type="text" name="title"
				value="${movie.title}" />
		</div>
		<div>
			<label>Category</label> <input type="text" name="category"
				value="${movie.category}" />
		</div>
		<div>
			<label>Description</label>
			<textarea name="description">${movie.description}</textarea>
		</div>
		<div>
			<label>Year</label> <input type="number" name="year"
				value="${movie.year}" />
		</div>
		<div>
			<label>Rating</label> <select name="rating">
				<option value="G">G</option>
				<option value="PG">PG</option>
				<option value="PG13">PG13</option>
				<option value="R">R</option>
			</select>
		</div>
		<div>
			<label>Black and white</label> <input type="checkbox"
				name="blackAndWhite" value="${movie.blackAndWhite}"/>
		</div>
		<button type="submit">Create</button>
	</form>

</body>
</html>