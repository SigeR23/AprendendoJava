package br.com.caelum.c10Interfaces;

//testando, calcular area do quadrado, retangulo e circulo.

public class Teste {
	public static void main(String[] args) {
		AreaCalculavel q = new Quadrado(3);
		AreaCalculavel r = new Retangulo(2, 3);
		Circulo c = new Circulo(2);

		System.out.println("Area do Quadrado: " + q.calcularArea());
		System.out.println("Area do Retângulo: " + r.calcularArea());
		System.out.println("Area do Círculo: " + c.calcularArea());
	}
}
