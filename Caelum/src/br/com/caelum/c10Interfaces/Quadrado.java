package br.com.caelum.c10Interfaces;

public class Quadrado implements AreaCalculavel{
	private double lado;
	
	public Quadrado (double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}
}
