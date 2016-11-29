package br.com.caelum.socket;

import java.io.FileInputStream;
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
		
		Socket cliente = new Socket("127.0.0.2", 12342);
		System.out.println("Cliente se conectou");
		Scanner entrada  = new Scanner(new FileInputStream("Arquivos/arquivo.txt"));
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		while (entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}
		saida.close();
		entrada.close();
		cliente.close();
	}
}
