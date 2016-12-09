package br.com.siger.jogodaforca;

import java.util.HashSet;
import java.util.Set;

import br.com.siger.jogodaforca.utils.Console;

public class Jogo {
	
	private static final int MAX_ERROS = 5;
	
	public void iniciar() throws JogoDaForcaException {
		Set<Character> letrasUsadas = new HashSet<>();
		
		int erros = 0;
		
		Dicionario dicionario = Dicionario.getInstance();
		Palavra palavra = dicionario.proximaPalavra();
		
		System.out.println("Bem vindo ao jogo da forca");
		System.out.println("A palavra tem " + palavra.tamanho() + " letras");
		
		while(true) {
			System.out.println(palavra);
			
			System.out.println();
			
			char letra;
			
			try {
				System.out.print("Digite um letra: ");
				letra = Console.lerCaracter();
				
				if(letrasUsadas.contains(letra)) 
					throw new CaracterInvalidoException("Essa letra ja foi usada.");
				
				letrasUsadas.add(letra);
				
				if(palavra.possuiLetra(letra)) {
					System.out.println("Você acertou uma letra.");
				} else {
					erros++;
					if(erros < MAX_ERROS) {
						System.out.println("Você errou! Você ainda pode errar " +  (MAX_ERROS - erros) + " vez(es).");
					}
				}
				
				System.out.println();
				
				if(palavra.acertouPalavra()) {
					System.out.println("Você acertou a palavra completa: " + palavra.getPalavraOriginal());
					System.out.println("Fim de jogo");
					break;
				}
				
				if(erros == MAX_ERROS) {
					System.out.println("Você perdeu! a palavra era: " + palavra.getPalavraOriginal());
					System.out.println("Fim de jogo");
					break;
				}
			} catch (CaracterInvalidoException e) {
				throw new JogoDaForcaException(e.getMessage());
			}
		}
	}
}
