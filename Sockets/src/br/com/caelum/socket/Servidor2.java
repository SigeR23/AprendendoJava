package br.com.caelum.socket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author SigeR
 *	
 * servidor2 deve ler de um arquivo e copiar o conteudo para outro
 */
public class Servidor2 {
	
	public static void main(String[] args) throws IOException{
		
		ServerSocket servidor = new ServerSocket(12341);
		
		Socket cliente = servidor.accept();
		System.out.println("" + cliente.getInetAddress().getHostAddress() + " está conectado");
		
		Scanner entrada = new Scanner(cliente.getInputStream());
		
		PrintStream saida = new PrintStream("Arquivos/recebido.txt");
		
		while (entrada.hasNext()) {
			saida.println(entrada.nextLine());
		}
		
		saida.close();
		entrada.close();
		servidor.close();
	}
}
