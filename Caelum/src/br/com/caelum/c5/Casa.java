package br.com.caelum.c5;

public class Casa {
	public String cor;
	public int totalPortas = 0;
	public Porta[] portas = new Porta[4];
	
	public void pintaDe(String cor) {
		this.cor = cor;
	}
	
	public int quantasPortasAbertas() {
		int cont = 0;
		for (int i = 0; i < this.portas.length; i++) {
			if(this.portas[i] != null && this.portas[i].estaAberta())
				cont++;
		}
		return cont;
	}
	public void adicionaPorta(Porta p) {
		if(this.totalPortas < 4) {
			this.portas[this.totalPortas] = p;
			this.totalPortas++;
		}	
	}
	public int exibirTotalPortas() {
		return this.totalPortas;
	}
}
