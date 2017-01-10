package br.com.caelum.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modal.Contato;

public class ListaContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
			List<Contato> contatos = new ContatoDAO().getLista();
			
			req.setAttribute("contatos", contatos);
		return "/WEB-INF/jsp/lista-contatos-jstl.jsp";
	}

}
