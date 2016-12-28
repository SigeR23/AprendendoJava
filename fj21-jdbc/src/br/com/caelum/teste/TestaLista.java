package br.com.caelum.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modal.Contato;

public class TestaLista {
	public static void main(String[] args) {
		
		
		ContatoDAO contatoDao = new ContatoDAO();
		List<Contato> contatos = contatoDao.getLista();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for(Contato contato : contatos) {
			System.out.println("ID: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("E-mail: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + sdf.format(contato.getDataNascimento().getTime()));
			
			System.out.println();
		}
	}
}
