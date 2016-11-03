package br.com.caelum.c10Interfaces;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel t) {
		System.out.println("Adiciona Tributavel: " + t);
		this.total += t.calcularTributos();
	}
	
	public double getTotal() {
		return total;
	}
}
