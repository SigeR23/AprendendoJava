package br.com.caelum.c3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner (System.in);
		
		System.out.println("Insira um número inteiro");
		int x = scanner.nextInt();
		
		while (x != 2) {
			if (x % 2 == 0) {
				x /= 2;
				System.out.print(x + " -> ");
			} else {
				x = x * 3 + 1;
				System.out.print(x + " -> ");
			}
		}
		
		System.out.println(x/2);
		scanner.close();
	}
}
