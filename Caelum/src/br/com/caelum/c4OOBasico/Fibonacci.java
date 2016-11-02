package br.com.caelum.c4OOBasico;

public class Fibonacci {
	public int resultado (int i) {
		return (i <= 2) ? 1 : resultado(i - 1) + resultado(i - 2);
	}
}
