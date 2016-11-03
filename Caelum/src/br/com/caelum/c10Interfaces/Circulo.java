package br.com.caelum.c10Interfaces;

public class Circulo implements AreaCalculavel{
	private double raio;
	
	public Circulo (double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}
}
