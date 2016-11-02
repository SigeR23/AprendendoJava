package br.com.caelum.c9CAbstratas;

public class ContaCorrente extends Conta {
	
	public void deposita(double valor) {
		this.saldo += valor - 0.1;
	}
	
	public void atualiza (double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
}
