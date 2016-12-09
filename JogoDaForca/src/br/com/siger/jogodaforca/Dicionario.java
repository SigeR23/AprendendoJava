package br.com.siger.jogodaforca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.siger.jogodaforca.utils.GerarRandom;

public class Dicionario {
	
	private static final String ARQUIVO_DICIONARIO = "dicionario.txt";
	
	private static Dicionario instance;
	
	private List<String> palavras = new ArrayList<>();
	
	private Dicionario() {
		carregarPalavra();
	}
	
	public static Dicionario getInstance() {
		if (instance == null) {
			instance = new Dicionario();
		}
		return instance;
	}
	
	private void carregarPalavra() {
		
		try(Scanner scanner = new Scanner(new FileInputStream(ARQUIVO_DICIONARIO))) {
			
			while(scanner.hasNext()) {
				palavras.add(scanner.nextLine().trim());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Palavra proximaPalavra() throws JogoDaForcaException {
		if(palavras.size() == 0) 
			throw new JogoDaForcaException("Nenhuma palavra foi encontrada");
	
		int pos = GerarRandom.gerarNumeroRandom(0, palavras.size());
		
		return new Palavra(palavras.get(pos));
			
		
	}
}
