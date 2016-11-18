package br.com.caelum.c15IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteScanner2 {
	public static void main(String[] args) {
		String arquivo = "TesteIO/Teste1.txt";
		Scanner s = new Scanner(System.in);

		try(PrintStream ps = new PrintStream(arquivo)) {
			while(s.hasNextLine()) {
				ps.println(s.nextLine());
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("Arquivo não encontrado");
		}
	}	
}
