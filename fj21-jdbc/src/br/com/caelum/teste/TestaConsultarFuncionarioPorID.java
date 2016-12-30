package br.com.caelum.teste;

import br.com.caelum.dao.FuncionarioDAO;
import br.com.caelum.modal.Funcionario;

public class TestaConsultarFuncionarioPorID {
	
	public static void main(String[] args) {
		
		Long id = new Long(1);
		
		Funcionario funcionario  = null;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		funcionario = funcionarioDAO.consultarFuncionarioPorID(id);
		
		if(funcionario != null) {
			funcionario.imprimeFuncionario();
		} else {
			System.out.println("Nenhum funcionario encontrado com esse ID");
		}
		
	}
}
