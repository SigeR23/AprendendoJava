package br.com.caelum.c4OOBasico;

public class Casa {
	public String cor;
	public Porta p1 = new Porta();
	public Porta p2 = new Porta();
	public Porta p3 = new Porta();
	
	public void pintaDe(String cor) {
		this.cor = cor;
	}
	
	public int quantasPortasAbertas() {
		int i = 0;
		if(p1.estaAberta())
			i++;
		
		if(p2.estaAberta())
			i++;
		
		if(p3.estaAberta())
			i++;
		
		return i;
	}
}
