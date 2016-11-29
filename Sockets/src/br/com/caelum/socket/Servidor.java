package br.com.caelum.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author SigeR
 * 
 *	classe que representará o servidor
 */
public class Servidor {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Portar 12345 está aberta");
		
		Socket cliente = servidor.accept();
		System.out.println("Cliente Conectado " + cliente.getInetAddress().getHostAddress());
		
		Scanner entrada = new Scanner(cliente.getInputStream());
		while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		
		entrada.close();
		servidor.close();
		
		
	}
}
