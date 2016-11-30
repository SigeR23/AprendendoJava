package br.com.socket2conexoes;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket cliente  = new Socket("127.0.0.100", 12323);
		
		Scanner entrada = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		while(entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}
		
		cliente.close();
		entrada.close();
		saida.close();
			
	}
}
