<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Contatos</title>
</head>
<body>

	<c:import url="../../cabecalho.jsp"/>

	<table border=1>
		<tr>
			<td><b>ID</b></td>
			<td><b>Nome</b></td>
			<td><b>E-mail</b></td>
			<td><b>Endereço</b></td>
			<td><b>Data de Nascimento</b></td>
			<c:forEach var="contato" items="${contatos}" varStatus="id">
				<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
					<td>${contato.id}</td>
					<td>${contato.nome}</td>

					<td><c:choose>
							<c:when test="${not empty contato.email}">
								<a href="mailto:${contato.email}">${contato.email}</a>
							</c:when>
							<c:otherwise>
						email não informado.
					</c:otherwise>
						</c:choose></td>
					<td>${contato.endereco}</td>
					<td><fmt:formatDate value="${contato.dataNascimento.time}"
							pattern="dd/MM/yyyy" /></td>
					<td><a href="mvc?logica=AlteraContatoLogica&id=${contato.id }">Alterar</a>
					<td><a href="mvc?logica=RemoveContatoLogica&id=${contato.id}">Remover</a></td>
			</c:forEach>
	</table>
	<c:import url="../../rodape.jsp" />
</body>
</html>