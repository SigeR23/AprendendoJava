package br.com.caelum.c4;

public class TestaFuncionario03 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;
		
		if(f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("Diferentes");	
		}
		
	}
}
