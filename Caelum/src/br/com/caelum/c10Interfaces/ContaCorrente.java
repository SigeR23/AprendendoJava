package br.com.caelum.c10Interfaces;

public class ContaCorrente extends Conta implements Tributavel {
	
	public void deposita(double valor) {
		this.saldo += valor - 0.1;
	}
	
	public void atualiza (double taxa) {
		super.atualiza(taxa*2);;
	}

	public double calcularTributos() {
		
		return this.getSaldo() * 0.01;
	}
}
