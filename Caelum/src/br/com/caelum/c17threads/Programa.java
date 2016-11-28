package br.com.caelum.c17threads;

public class Programa implements Runnable {

	private int id;
	public void run() {
		for (int i = 0; i < 1000; i ++) {
			System.out.println("Programa " + id + " imprime " + i);
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
