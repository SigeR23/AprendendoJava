package br.com.caelum.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 * @author SigeR
 *	deve se conectar ao servidor e escrever em um arquivo para o servidor copia-lo
 */
public class Cliente2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket cliente = new Socket("127.0.0.2", 12341);
		System.out.println("Cliente se conectou");
		
		Scanner entrada  = new Scanner(System.in);
		PrintStream saida = new PrintStream("Arquivos/arquivo.txt");
		
		while (entrada.hasNext()) {
			saida.println(entrada.nextLine());
		}
		
		saida.close();
		entrada.close();
		cliente.close();
	}
}
