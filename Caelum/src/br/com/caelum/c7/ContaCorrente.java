package br.com.caelum.c7;

public class ContaCorrente extends Conta {
	
	public void deposita(double valor) {
		this.saldo += valor - 0.1;
	}
	
	public void atualiza (double taxa) {
		super.atualiza(taxa*2);;
	}
}
