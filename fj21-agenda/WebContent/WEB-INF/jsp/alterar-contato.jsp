<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="cdata" %>
<html>
<head>
<link href="../../jquery-ui-1.12.1/jquery-ui.css" rel="stylesheet">
<script src="../../jquery-ui-1.12.1/external/jquery/jquery.js"></script>
<script src="../../jquery-ui-1.12.1/jquery-ui.js"></script>
<title>Alterar Contato</title>
</head>
<body>
	<c:import url="../../cabecalho.jsp" />
	<h3>Alterar Contato</h3>
	
	<hr />
	<form action="">
		ID: <input type="text" name="id" value="${contato.id }" readonly><br>
		Nome: <input type="text" name="nome" value="${contato.nome}"><br>
		E-mail <input type="text" name="email" value="${contato.email}"><br>
		Endereco: <input type="text" name="endereco" value="${contato.endereco}"><br>
		Data de Nascimento:
		<cdata:campoData id="dataNascimento" />
		<br />
		<input type="submit" value="salvar">
	</form>
	<c:import url="../../rodape.jsp"/>
</body>
</html>