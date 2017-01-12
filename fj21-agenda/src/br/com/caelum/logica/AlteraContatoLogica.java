package br.com.caelum.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modal.Contato;

public class AlteraContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		long id = Long.parseLong(req.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		Contato c = new ContatoDAO((Connection) req.getAttribute("conexao")).getContato(contato);
		
		req.setAttribute("contato", c);
		return "/WEB-INF/jsp/alterar-contato.jsp";
	}

}
