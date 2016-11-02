package br.com.caelum.c3ControleDeFluxo;

public class Fibonacci1 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				System.out.println(y);
				y += x;
			} else {
				System.out.println(x);
				x += y;
			}
		}
		System.out.println("time = " + (System.currentTimeMillis() - time));
	}
}
