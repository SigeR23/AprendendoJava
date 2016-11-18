package br.com.caelum.c15IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author SigeR
 *	Testando Ler de um arquivo com o FileInputStream
 */
public class TesteLerDoArquivo {
	public static void main(String[] args) {
		String arquivo = "TesteIO/arquivo.txt";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)))) {
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo Não encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error ao ler do arquivo");
		}
	}
}
