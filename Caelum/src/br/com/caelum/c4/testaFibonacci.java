package br.com.caelum.c4;

public class testaFibonacci {
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		long time = System.currentTimeMillis();
		 for (int i = 1; i <= 30; i++) {
			 System.out.println(f.resultado(i));
		 }
		 System.out.println("Time = " + (System.currentTimeMillis() - time));
	}
}

