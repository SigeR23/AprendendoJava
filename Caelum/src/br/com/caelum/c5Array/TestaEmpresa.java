package br.com.caelum.c5Array;

public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa e = new Empresa();

		
		Funcionario f1 = new Funcionario();
		f1.salario = 1000;
		e.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f1.salario = 1700;
		e.adiciona(f2);
		
		e.mostraEmpregados();
		
		System.out.println(e.contem(f1));
		
		Funcionario f3  = new Funcionario();
		System.out.println(e.contem(f3));
		
		e.adiciona(f3);
		e.mostraEmpregados();
	}
}
