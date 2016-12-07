package br.com.jogodavelha.pontuacao;

public interface GerenciadorDePontuacao {
	
	public Integer getPontuacao(String nome);
	
	public void gravarPontuacao(String nome) throws PontuacaoExcpetion;
}
