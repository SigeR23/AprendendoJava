package br.com.caelum.c16Collections;

import br.com.caelum.c11Exceções.ValorInvalidoException;

public class Conta {
	protected String nome;
	protected static int totalDeContas = 0;
	protected int numeroDaConta;
	protected double saldo;
	
	public Conta() {
		this.numeroDaConta = totalDeContas++;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Conta) {
			return this.numeroDaConta == ((Conta)obj).numeroDaConta;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "" + this.numeroDaConta + " - " + this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}

