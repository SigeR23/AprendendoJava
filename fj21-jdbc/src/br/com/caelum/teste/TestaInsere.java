package br.com.caelum.teste;

import java.util.Calendar;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modal.Contato;

public class TestaInsere {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("José");
		contato.setEmail("josé.zé@zezé.com");
		contato.setEndereco("Rua a, 23");
		contato.setDataNascimento(Calendar.getInstance());
		
		new ContatoDAO().adiciona(contato);
		
		System.out.println("gravado");
	}
}
