package br.com.caelum.c4OOBasico;

public class TestaCasa {
	public static void main(String[] args) {
		Casa c1 = new Casa();
		 
		c1.pintaDe("Preto");
		c1.p1.abre();
		
		System.out.println("Portas Abertas: " + c1.quantasPortasAbertas());
		
		c1.p1.fecha();
		c1.p2.abre();
		c1.p3.abre();
		
		System.out.println("Portas Abertas agora: " + c1.quantasPortasAbertas());
	}
}
