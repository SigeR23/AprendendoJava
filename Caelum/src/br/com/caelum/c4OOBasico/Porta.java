package br.com.caelum.c4OOBasico;

public class Porta {
	public boolean aberta;
	public String cor;
	public double dimensaoX;
	public double dimensaoY;
	public double dimensaoZ;
	
	public void abre() {
		this.aberta = true;
	}
	
	public void fecha() {
		this.aberta = false;
	}
	
	public void pintaDe(String c) {
		this.cor = c;
	}
	
	public boolean estaAberta() {
		return (this.aberta) ? true : false;
	}
}
