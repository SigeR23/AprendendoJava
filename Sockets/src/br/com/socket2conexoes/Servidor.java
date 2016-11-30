package br.com.socket2conexoes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket servidor = new ServerSocket(12323);
		
		while(true) {
			Socket cliente = servidor.accept();
			System.out.println("Estou Aqui");
			TrataCliente tc = new TrataCliente(cliente);
			
			Thread t = new Thread(tc);
			
			t.run();
		}
	}
}
