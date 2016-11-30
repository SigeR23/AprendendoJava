package br.com.socket2conexoes;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TrataCliente implements Runnable{
	
	private Socket cliente;
	
	public TrataCliente(Socket cliente) {
		this.cliente = cliente;	
	}
	public void run() {
		cliente.
		try (Scanner s =  new Scanner(cliente.getInputStream())) {
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Problema na entrada de dados");
		}
		
	}	
	
}
