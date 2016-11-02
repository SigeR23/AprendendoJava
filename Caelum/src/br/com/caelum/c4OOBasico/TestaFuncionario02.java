package br.com.caelum.c4OOBasico;

public class TestaFuncionario02 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data dt = new Data();
		dt.dia = 21;
		dt.mes = 12;
		dt.ano = 1999;
		
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);
		
		f1.mostra();
		f1.dtEntrada = dt;
		
		System.out.println("Sálario atual: " + f1.salario);
		System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
		
		f1.mostra();
	}
}
