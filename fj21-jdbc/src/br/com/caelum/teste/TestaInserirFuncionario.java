package br.com.caelum.teste;

import br.com.caelum.dao.FuncionarioDAO;
import br.com.caelum.modal.Funcionario;

public class TestaInserirFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f  = new Funcionario();
		
		f.setNome("Carlos");
		f.setUsuario("CarlosS");
		f.setSenha("415263");
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.inserirFuncionario(f);
	}
}
