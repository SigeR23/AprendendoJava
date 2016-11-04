package br.com.caelum.c10Interfaces;

public class ContaCorrente implements ContaTributavel {
	private double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor - 0.1;
	}
	
	public void atualiza (double taxa) {
		this.saldo += this.saldo * taxa  * 2;;
	}

	public double calcularTributos() {
		
		return this.saldo * 0.01;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
