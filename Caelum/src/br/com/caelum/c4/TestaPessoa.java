package br.com.caelum.c4;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Junin";
		p.idade = 13;
		
		p.fazAniversário();
		p.fazAniversário();
		
		System.out.println("Nome: " + p.nome + "\nIdade: " + p.idade);
	}
}
