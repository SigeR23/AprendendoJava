package br.com.caelum.c7HerancaPolim;

public class ContaPoupanca extends Conta {
	
	public void atualiza (double taxa) {
		super.atualiza(taxa * 3);;
	}
}
