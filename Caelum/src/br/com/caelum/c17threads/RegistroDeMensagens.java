package br.com.caelum.c17threads;

import java.util.ArrayList;


import java.util.Collection;
import java.util.Vector;

public class RegistroDeMensagens {
	
	public static void main(String[] args) throws InterruptedException {
		
		Collection<String> mensagens = new ArrayList<>();
		
		Thread t1 = new Thread(new ProduzMensagem(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagem(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagem(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtoras de mensagem finalizadas!");
		for(int i = 0; i < 15000; i++) {
			if(!mensagens.contains("Mensagem: " + i ))
				throw new IllegalStateException("Não encontrei a mensagem " + i);
		}
		
		if(mensagens.contains(null))
			throw new IllegalStateException("não devia ter null aqui dentro");
		
		System.out.println("Fim da execução");
	}
}
