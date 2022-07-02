<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Funcionarios</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Lista de Funcionarios</h2>

	  <form action="/funcionario" method="get">
	    <button type="submit" class="btn btn-primary">Nova</button>
	  </form>
	  
	  	<hr>
		<c:if test="${not empty lista}">		
		<h2>Total de funcionarios: ${funcionarios.size()}</h2>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		       	<th>ID</th>
		        <th>Nome</th>
		        <th>Login</th>
		        <th>CPF</th>
		        <th>Email</th>
		        <th>Telefone</th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="f" items="${funcionarios}">
			      <tr>
			        <td>${f.id}</td>
			        <td>${f.nome}</td>
			        <td>${f.login}</td>
			        <td>${f.cpf}</td>
			        <td>${f.email}</td>
			         <td>${f.telefone}</td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem funcionarios cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>