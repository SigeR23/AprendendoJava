package br.com.caelum.c11Exce��es;

public class ContaPoupanca extends Conta {
	
	public void atualiza (double taxa) {
		super.atualiza(taxa * 3);;
	}
}
