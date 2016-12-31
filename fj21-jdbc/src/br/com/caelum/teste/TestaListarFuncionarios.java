package br.com.caelum.teste;

import java.util.List;

import br.com.caelum.dao.FuncionarioDAO;
import br.com.caelum.modal.Funcionario;

public class TestaListarFuncionarios {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setNome("Jhow");
		f.setUsuario("JhowJhow");
		f.setSenha("*97*7979*");
		
		FuncionarioDAO fDAO = new FuncionarioDAO();
		
		fDAO.inserirFuncionario(f);
		
		List<Funcionario> funcionarios = fDAO.listarFuncionarios();
		
		for(Funcionario funcionario : funcionarios) {
			funcionario.imprimeFuncionario();
		}
	}
}
