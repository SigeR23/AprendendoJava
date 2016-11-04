package br.com.caelum.c10Interfaces;

public class ContaPoupanca implements Conta {
	private double saldo;
	
	public void atualiza (double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
