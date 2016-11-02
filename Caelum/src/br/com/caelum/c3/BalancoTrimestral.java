package br.com.caelum.c3;

public class BalancoTrimestral {
	
	public static void main (String []args) {
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		System.out.println(gastoTrimestre);
		
		long mediaMensal = gastoTrimestre/3;
		
		System.out.println("Média mensal = " + mediaMensal);
	}
}
