package br.com.caelum.c16Collections;

public class TesteThread2 {
	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Thread rodando " + i);
			}
		});
		t.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("Main Rodadndo " + i);
		}
	}
}
