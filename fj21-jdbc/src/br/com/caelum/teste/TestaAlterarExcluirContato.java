package br.com.caelum.teste;

import java.util.Calendar;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modal.Contato;

public class TestaAlterarExcluirContato {
	
	public static void main(String[] args) {
		
		Contato c = new Contato();
		
		c.setNome("João");
		c.setEmail("jo.joao@jo.com");
		c.setEndereco("rua j, 123");
		c.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.adiciona(c);
		
		Contato contatoAlterar = null;
		
		for(Contato contato : contatoDAO.getLista()) {
			contato.imprimirContato();
			
			if(contato.getNome().equals(c.getNome())) 
				contatoAlterar = contato;
		}
		
		contatoAlterar.setNome("Jonas");
		contatoDAO.alterarContato(contatoAlterar);
		
		for(Contato contato : contatoDAO.getLista()) {
			contato.imprimirContato();
		}
		
		contatoDAO.excluirContatoPorID(contatoAlterar.getId());
		
		for(Contato contato : contatoDAO.getLista()) {
			contato.imprimirContato();
		}
	}
}
