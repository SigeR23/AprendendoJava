package br.com.caelum.c7HerancaPolim;

public class Conta {
	protected static int totalDeContas = 0;
	protected int numeroDaConta;
	protected double saldo;
	
	public Conta() {
		this.numeroDaConta = totalDeContas++;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	

	public boolean equals(Object o) {
		Conta outraConta = (Conta) o;
		if(this.getNumeroDaConta() == outraConta.getNumeroDaConta()) {
			return true;
		}
		return false;
	}
}

