package br.com.caelum.c5;

public class Fibonacci {
	public static int[] fibonacci = new int [30];
	
	public static int resolveFibonacci(int i) {
		return (i < 2) ? 1 : fibonacci[i-1] + fibonacci[i-2];
	}
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		for (int i = 0; i < 30; i++) {
			fibonacci[i] = resolveFibonacci(i);
			System.out.println(fibonacci[i]);
		}
		System.out.println("Time = " + (System.currentTimeMillis() - time));
	}
}
