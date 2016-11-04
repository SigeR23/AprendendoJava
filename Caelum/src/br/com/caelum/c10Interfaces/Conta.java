package br.com.caelum.c10Interfaces;

public interface Conta {
	/*protected static int totalDeContas = 0;
	protected int numeroDaConta;
	protected double saldo;*/
	public double getSaldo();
	
	public void deposita(double valor);
	
	public void saca(double valor);
	
	public void atualiza(double taxa);
	
}
