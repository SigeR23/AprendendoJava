package br.com.caelum.c6;

public class TestaFuncionario3 {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Funcionario f2 = new Funcionario("Hit");
		
		System.out.println(f.getIdentificador() + " - " + f.getNome());
		System.out.println(f2.getIdentificador() + " - " + f2.getNome());
	}
}
