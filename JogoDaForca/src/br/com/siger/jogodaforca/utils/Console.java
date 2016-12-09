package br.com.siger.jogodaforca.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.siger.jogodaforca.CaracterInvalidoException;
import br.com.siger.jogodaforca.JogoDaForcaException;

public class Console {
	
	public static char lerCaracter() throws JogoDaForcaException{
		BufferedReader br = null;
		try { 
			br = new BufferedReader(new InputStreamReader(System.in));
			String linha = br.readLine();
			
			if(linha.trim().isEmpty()) {
				throw new CaracterInvalidoException("Por favor digite uma letra.");
			}
			if((linha.length()) > 1) {
				throw new CaracterInvalidoException("Por favor digite apenas uma letra.");
			}
			
			char letra = linha.toUpperCase().charAt(0);
			
			if(!Character.isLetter(letra)) {
				throw new CaracterInvalidoException("Somente letras devem ser digitadas");
			}
			
			return letra;
 			
		} catch (IOException e) {
			throw new JogoDaForcaException("Erro ao ler caracter do teclado " + e);
		}
	}
}
