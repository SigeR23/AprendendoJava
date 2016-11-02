package br.com.caelum.c9CAbstratas;


public abstract class Conta {
	protected static int totalDeContas = 0;
	protected int numeroDaConta;
	protected double saldo;
	
	public Conta() {
		this.numeroDaConta = totalDeContas++;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	abstract void deposita(double valor);
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	abstract void atualiza(double taxa);
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	

	public boolean equals(Conta c) {
		if(this.getNumeroDaConta() == c.getNumeroDaConta()) {
			return true;
		}
		return false;
	}
	public void emprestimo(double valor) {
		this.deposita(valor);
	}
}
