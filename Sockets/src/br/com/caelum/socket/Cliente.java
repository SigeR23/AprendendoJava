package br.com.caelum.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 * @author SigeR
 *
 *	cliente
 */
public class Cliente {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
	
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("Cliente se conectou ao servidor");
		
		Scanner entrada = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		while(entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}
		
		entrada.close();
		saida.close();
		cliente.close();
	}
}
