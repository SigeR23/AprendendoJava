package br.com.siger.jogodaforca;

import java.util.HashSet;
import java.util.Set;

public class Palavra {
	
	private static final char CARACTER_SECRETO = '_';
	
	private String palavraOriginal;
	
	private Set<Character> caracteresEncontrados = new HashSet<>();
	
	public Palavra(String palavra) {
		this.palavraOriginal = palavra.toUpperCase();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		char[] letrasArray = palavraOriginal.toCharArray();
		
		for(int i = 0; i < letrasArray.length; i++) {
			char c = letrasArray[i];
		
		
			if(caracteresEncontrados.contains(c)) {
				sb.append(c);
			} else {
				sb.append(CARACTER_SECRETO);
			}
			
			sb.append(" ");
		
		}
		return sb.toString().trim();
			
	}
	
	public int tamanho() {
		
		return palavraOriginal.length();
	}
	
	public boolean possuiLetra(char letra) {
		if(palavraOriginal.indexOf(letra) > -1) {
			caracteresEncontrados.add(letra);
			return true;
		}
		
		return false;
	}
	
	public boolean acertouPalavra() {
		
		char[] palavra = palavraOriginal.toCharArray();
		
		Set<Character> letras = new HashSet<>();
		
		for(int i = 0; i < palavra.length; i++) {
			letras.add(palavra[i]);
		}
		
		return letras.equals(caracteresEncontrados);
	}
	
	public String getPalavraOriginal() {
		return palavraOriginal;
	}
	
}

