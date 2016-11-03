package br.com.caelum.c10Interfaces;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calcularTributos());
		
		Tributavel t = cc;
		System.out.println(t.calcularTributos());
		
		
	}
}
