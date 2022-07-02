<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Estabelecimentos</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Estabelecimentos</h2>
	 
	  <form action="/estabelecimento/incluir" method="post">
	  	
	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" name="nome" value="">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Login:</label>
	      <input type="text" class="form-control" placeholder="Entre com o login" name="login" value="">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Senha:</label>
	      <input type="text" class="form-control" placeholder="Entre com o senha" name="senha" value="">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>CNPJ:</label>
	      <input type="text" class="form-control" placeholder="Entre com o cpf" name="cpf" value="">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Endereco:</label>
	      <input type="text" class="form-control" placeholder="Entre com o endereco" name="endereco" value="">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Telefone:</label>
	      <input type="text" class="form-control" placeholder="Entre com o telefone" name="telefone" value="">
	    </div>
	    	    
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>