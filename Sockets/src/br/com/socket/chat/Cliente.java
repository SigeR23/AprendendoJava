package br.com.socket.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		new Cliente("127.0.0.1", 12345).executa();
	}
	
	private String host;
	private int porta;
	
	public Cliente(String host, int porta) {
		this.host = host;
		this.porta = porta;
	}
	
	public void executa() throws UnknownHostException, IOException {
			
		Socket cliente = new Socket(this.host, this.porta);
		
		new Thread(new Recebedor(cliente.getInputStream())).start();
		
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream(cliente.getOutputStream());
		
		while(s.hasNextLine()) {
			ps.println(s.nextLine());
			
		}
		
		s.close();
		ps.close();
		cliente.close();
		
	}
}
