package br.com.caelum.c17threads;
/**
 * 
 * @author SigeR
 *	
 *	testando uso de threds com a classe Programa
 */
public class TesteThread {
	public static void main(String[] args) {
		
		Programa p1 = new Programa();
		p1.setId(1);
		Thread t = new Thread(p1);
		t.start();
		
		Programa p2 = new Programa();
		p2.setId(2);
		Thread t2 = new Thread(p2);
		t2.start();
	}
}
