package br.com.socket.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

	public static void main(String[] args) throws IOException {
		new Servidor(12345).executa();
		
	}
	
	private int porta;
	private List<PrintStream> clientes;
	
	public Servidor(int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<>();
	}
	
	public void executa() throws IOException {
		
		ServerSocket servidor = new ServerSocket(this.porta);
		
		while(true) {
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
			
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);
			
			new Thread(new TrataCliente(cliente.getInputStream(), this)).start();
			
		}
	}
	
	public void distribuiMensagem(String msg) {
		
		for(PrintStream cliente : this.clientes) {
			cliente.println(msg);
		}
		
	}
	
}
