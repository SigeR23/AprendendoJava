package br.com.caelum.c4OOBasico;

public class TestaPorta {
	public static void main(String[] args) {
		Porta p = new Porta();
				
		p.pintaDe("azul");
		System.out.println(p.estaAberta());
		
		p.abre();
		System.out.print(p.estaAberta());
	}
}
