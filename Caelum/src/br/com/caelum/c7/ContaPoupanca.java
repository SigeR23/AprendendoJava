package br.com.caelum.c7;

public class ContaPoupanca extends Conta {
	
	public void atualiza (double taxa) {
		super.atualiza(taxa * 3);;
	}
}
