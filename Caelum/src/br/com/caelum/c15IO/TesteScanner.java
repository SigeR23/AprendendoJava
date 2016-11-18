package br.com.caelum.c15IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 * @author SigeR
 * 	testando Scanner para ler de um arquivo
 */
public class TesteScanner {
	public static void main(String[] args) {
		String arquivo = "TesteIO/arquivo.txt";
		String arquivo2 = "TesteIO/arquivo2.txt";
		
		try (Scanner s = new Scanner(new FileInputStream(arquivo)); PrintStream ps = new PrintStream(arquivo2)){
		
		while (s.hasNextLine()) {
			ps.println(s.nextLine()); //escreve no arquivo2.txt o que está sendo lido no arquivo.txt
		}
			ps.println("copia");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo não encontrado");
		}
	}
}
