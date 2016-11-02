package br.com.caelum.c7;

public class Banco {
	private Conta[] contas;
	private int totalDeContas = 0;
	private int maximoDeContas;
	
	public Banco(int maximoDeContas) {
		this.maximoDeContas = maximoDeContas;
		contas = new Conta[this.maximoDeContas];
	}
	
	public void adiciona(Conta c) {
		if (this.totalDeContas < this.maximoDeContas)
			contas[totalDeContas++] = c;
	}
	
	public int getTotalDeContas () {
		return this.totalDeContas;
	}
	
	public Conta pegaConta(Conta c) {
		for (Conta c1 : contas) {
			if(c1.equals(c)) {
				return c;
			}
		}
		return null;
	}
	public void atualizaGeral() {
		AtualizaContas at = new AtualizaContas();
		for (Conta c1 : contas) {
			if (c1 != null){
				at.atualiza(c1, 0.5);
			}
		}
	}
}

