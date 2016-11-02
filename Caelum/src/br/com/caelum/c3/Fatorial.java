package br.com.caelum.c3;

public class Fatorial {
	
	public static void main(String[] args) {
		int x = 1;
		for (int i = 1; i < 11; i++) {
			x *= i;
			System.out.println("Fatorial de " + i + " é = " + x);
		}
		
		
	}
}
