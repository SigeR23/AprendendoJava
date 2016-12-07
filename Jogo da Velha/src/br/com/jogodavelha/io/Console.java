package br.com.jogodavelha.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	
	public static String readString() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e)  {
			throw new RuntimeException("Erro ao ler o dado do teclado");
		}
	}
	
	public static int readInt() {
		String string = readString();
		
		try {
			return Integer.parseInt(string);
			
		} catch (NumberFormatException e ) {
			throw new RuntimeException(string + "Não é um inteiro válido.");
		}
	}
	
	public static double readDouble() {
		String string  =  readString();
		try {
			return Double.parseDouble(string);
			
		} catch (NumberFormatException e) {
			throw new RuntimeException(string + "Não é um double válido");
		}

	}
}
