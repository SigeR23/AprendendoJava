package br.com.caelum.c15IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 
 * @author SigeR
 *
 *	testando entrada padrao (InputStream(System.in))
 */
public class TesteEntradaPadrao {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		
		System.out.println("Digite sua mensagem");
		try (BufferedReader br = new BufferedReader(isr)) { // TRY-WITH-RESOURCES
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error ao ler da entrada padrão");
		}
	}	
}
