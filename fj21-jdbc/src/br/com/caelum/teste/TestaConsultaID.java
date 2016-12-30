package br.com.caelum.teste;

import java.text.SimpleDateFormat;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modal.Contato;

public class TestaConsultaID {

	public static void main(String[] args) {
		Long id = new Long(4);
		Contato c = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ContatoDAO contatoDAO = new ContatoDAO();
		
		
		c = contatoDAO.getContatoPorID(id);
		if(c != null) {
			System.out.println("ID: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			System.out.println("E-mail: " + c.getEmail());
			System.out.println("Endereço: " + c.getEndereco());
			System.out.println("Data de Nascimento: " + sdf.format(c.getDataNascimento().getTime()));
		} else {
			System.out.println("Nenhum contato encontrado com o ID = " + id);
		}
			
	}
}
