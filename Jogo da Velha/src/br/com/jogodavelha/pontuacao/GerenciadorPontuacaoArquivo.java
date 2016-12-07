package br.com.jogodavelha.pontuacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.rowset.spi.TransactionalWriter;

public class GerenciadorPontuacaoArquivo implements GerenciadorDePontuacao {
	
	private static final String ARQUIVO_PONTUACAO =	"pontuacao.txt";
	
	private Map<String, Integer> pontuacaoMap = new HashMap<>();
	
	public GerenciadorPontuacaoArquivo() {
		inicializar();
	}
	
	private void inicializar() throws PontuacaoExcpetion {
		
		File arquivo = new File(ARQUIVO_PONTUACAO);
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch(IOException e) {
				throw new  PontuacaoExcpetion(e.getMessage());
			}
		}
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(arquivo));
			String line;
			
			while((line = reader.readLine()) != null) {
				String[] tokens = line.split("\\|");
				
				pontuacaoMap.put(tokens[0].toUpperCase(), new Integer(tokens[1]));
			}
			
		} catch (IOException e) {
			throw new PontuacaoExcpetion(e.getMessage());
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new PontuacaoExcpetion(e.getMessage());
				}
			}
		}
	}
			
	public Integer getPontuacao(String nome) {
		return pontuacaoMap.get(nome.toUpperCase());
	}

	public void gravarPontuacao(String nome) throws PontuacaoExcpetion {
		
		Integer pontuacao = getPontuacao(nome);
		
		if (pontuacao == null) 
			pontuacao = 0;	
		
		pontuacaoMap.put(nome.toUpperCase(), ++pontuacao);
		
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(ARQUIVO_PONTUACAO));
			
			for(Map.Entry<String, Integer> entry : pontuacaoMap.entrySet()) {
				writer.write(entry.getKey() + "|" + entry.getValue());
				
				writer.newLine();
			}
		} catch (IOException e ) {
			throw new PontuacaoExcpetion(e.getMessage());
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					throw new PontuacaoExcpetion(e.getMessage());
				}
			}
		}
		
	}

}
