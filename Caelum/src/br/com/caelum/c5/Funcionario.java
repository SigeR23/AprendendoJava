package br.com.caelum.c5;

import br.com.caelum.c4.Data;

public class Funcionario {
	public String nome;
	public String departamento;
	public double salario;
	public Data dtEntrada = new Data();
	public String rg;
	
	public void recebeAumento(double valor) {
		this.salario += valor;
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salaraio: " + this.salario);
		System.out.println("Data de entrada no banco: " + this.dtEntrada.mostra());
		System.out.println("RG: " + this.rg);
	}
}
