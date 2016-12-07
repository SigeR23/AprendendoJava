package br.com.jogodavelha;

import java.util.ArrayList;

import br.com.jogodavelha.io.Console;
import br.com.jogodavelha.pontuacao.GerenciadorDePontuacao;
import br.com.jogodavelha.pontuacao.GerenciadorPontuacaoArquivo;

public class Jogo {
	
	private Tabuleiro tabuleiro = new Tabuleiro();
	
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	
	private GerenciadorDePontuacao gdp;
	
	public void jogar() throws JogoDaVelhaException {
		System.out.println("===============");
		System.out.println("|JOGO DA VELHA|");
		System.out.println("===============");
		System.out.println();
		
		gdp = new GerenciadorPontuacaoArquivo();
		
		System.out.print("Nome do jogador 1:  ");
		String nome = Console.readString();
		jogadores.add(new Jogador(nome, 'X'));
		
		Integer pontuacao = gdp.getPontuacao(nome);
		
		if(pontuacao != null) {
			System.out.println("O jogador " + nome + " ja possui " + pontuacao + " vitórias!");
		}
		
		System.out.print("Nome do jogador 2: ");
		nome = Console.readString();
		jogadores.add(new Jogador(nome, 'O'));
		
		pontuacao = gdp.getPontuacao(nome);
		
		if (pontuacao != null) {
			System.out.println("O jogador " + nome + " ja possui " + pontuacao + " vitórias!");
		}
		
		boolean finalizado = false;
		
		int indexJogadorAtual = 0;
		
		Jogador vencedor = null;
		
		while(!finalizado) {
			tabuleiro.imprime();
			
			Jogador jogador = jogadores.get(indexJogadorAtual);
			
			System.out.print("Jogador '" + jogador.getNome() +  "' => ");
			
			boolean sequenciaEncontrada;
			
			try {
				Jogada jogada = jogador.obterJogada();
				
				sequenciaEncontrada = tabuleiro.efetuarJogada(jogada, jogador.getSimbolo());
			} catch (JogadaInvalidaException e) {
				System.out.println("Erro: " + e.getMessage());
				continue;
			}
			
			if(sequenciaEncontrada) {
				vencedor = jogador;
				finalizado = true;
			} else if(tabuleiro.isCompleto()) {
				finalizado  = true;
			}
			
			indexJogadorAtual = (indexJogadorAtual + 1) % jogadores.size();
			
			System.out.println();
		}
		
		if(vencedor == null) {
			System.out.println("O jogo temrinou empatado");
		} else {
			System.out.println("O jogador '" + vencedor.getNome() + "' venceu a partida");
			gdp.gravarPontuacao(vencedor.getNome());
		}
		
		tabuleiro.imprime();
	}
}
