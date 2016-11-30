package br.com.socket2conexoes;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente2 {

	public static void main(String[] args) {
		
		try (Socket cliente = new Socket("127.0.0.101", 12323); Scanner s = new Scanner(System.in); PrintStream ps = new PrintStream(cliente.getOutputStream())) {
			while (s.hasNextLine()) {
				ps.println(s.nextLine());
			}
		} catch( IOException e) {
			System.out.println("Erro na entrada ou saida de dados");
		}
	}
}
