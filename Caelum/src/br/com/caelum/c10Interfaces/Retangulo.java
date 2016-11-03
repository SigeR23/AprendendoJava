package br.com.caelum.c10Interfaces;

public class Retangulo implements AreaCalculavel {
	
	private double base;
	private double altura;
	
	public Retangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	

	public double calcularArea() {
		return this.base * this.altura;
	}

}
