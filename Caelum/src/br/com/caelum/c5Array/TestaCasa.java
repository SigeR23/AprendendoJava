package br.com.caelum.c5Array;

public class TestaCasa {
	public static void main(String[] args) {
		Casa c = new Casa();
		
		c.pintaDe("Azul");
		
		Porta p1 = new Porta();
		c.adicionaPorta(p1);
		
		Porta p2 = new Porta();
		c.adicionaPorta(p2);
		
		Porta p3 = new Porta();
		c.adicionaPorta(p3);
		
		c.portas[2].abre();
		c.portas[1].abre();
		
		System.out.println("Portas Abertas: " + c.quantasPortasAbertas());
		System.out.println("Total de Portas: " + c.exibirTotalPortas());
	}
}
