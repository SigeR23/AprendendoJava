<%@ page
	import="java.util.*, br.com.caelum.modal.Contato, br.com.caelum.dao.ContatoDAO, java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contatos</title>
</head>
<body>
	<table BORDER=1 CELLSPACING=2 CELLPADDING=6>
		<%
			ContatoDAO contatoDAO = new ContatoDAO();
			List<Contato> contatos = contatoDAO.getLista();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		%>
		<tr>
			<td><b>ID</b></td>
			<td><b>Nome</b></td>
			<td><b>E-mail</b></td>
			<td><b>Endereço</b></td>
			<td><b>Data de Nascimento</b></td>

		</tr>
		<%
			for (Contato contato : contatos) {
		%>

		<tr>
			<td><%=contato.getId()%></td>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<td><%=sdf.format(contato.getDataNascimento().getTime())%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>