package br.com.caelum.teste;

import java.util.List;

import br.com.caelum.dao.FuncionarioDAO;
import br.com.caelum.modal.Funcionario;

public class TestaDeletarFuncionarioPorID {
	
	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = null;
		
		FuncionarioDAO fDAO = new FuncionarioDAO();
		
		funcionarios = fDAO.listarFuncionarios();
		
		for(Funcionario f : funcionarios) {
			f.imprimeFuncionario();
		}
		
		
		fDAO.deletarFuncionarioPorID(3);
		
		funcionarios = fDAO.listarFuncionarios();
		
		for(Funcionario f : funcionarios) {
			f.imprimeFuncionario();
		}
		
	}
}
