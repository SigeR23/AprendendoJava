package br.com.caelum.c4;

public class TestaFuncionario04 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;
		
		Funcionario f2 = f1;
		
		if (f1 == f2) {
			System.out.println("Iguais");

		} else {
			System.out.println("Diferentes");
		}
	}
}
