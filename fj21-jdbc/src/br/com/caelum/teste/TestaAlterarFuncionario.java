package br.com.caelum.teste;

import br.com.caelum.dao.FuncionarioDAO;
import br.com.caelum.modal.Funcionario;

public class TestaAlterarFuncionario {
	
	public static void main(String[] args) {
		Funcionario f = null;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		f = funcionarioDAO.consultarFuncionarioPorID(1);
		f.imprimeFuncionario();
		
		f.setNome("Clark");
		f.setUsuario("CK");
		f.setSenha("x1x2x3");
		
		funcionarioDAO.alterarFuncionario(f);
		
		f = funcionarioDAO.consultarFuncionarioPorID(1);
		f.imprimeFuncionario();
		
	}
}
