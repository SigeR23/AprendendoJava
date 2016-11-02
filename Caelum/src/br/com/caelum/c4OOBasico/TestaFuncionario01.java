package br.com.caelum.c4OOBasico;

public class TestaFuncionario01 {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.nome = "José";
		f.salario = 1000;
		
		f.recebeAumento(1000);
	System.out.println(f.nome + " ganho anual = " + f.calculaGanhoAnual());
	}
}
