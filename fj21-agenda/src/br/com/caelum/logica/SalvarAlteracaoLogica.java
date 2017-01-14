package br.com.caelum.logica;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modal.Contato;

public class SalvarAlteracaoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Contato contato = new Contato();
		contato.setId(Long.parseLong(req.getParameter("id")));
		contato.setNome(req.getParameter("nome"));
		contato.setEmail(req.getParameter("email"));
		contato.setEndereco(req.getParameter("endereco"));
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dataNascimento")));
		contato.setDataNascimento(dataNascimento);
		
		new ContatoDAO((Connection)req.getAttribute("conexao")).alterarContato(contato);
		return "mvc?logica=ListaContatoLogica";
	}

}
