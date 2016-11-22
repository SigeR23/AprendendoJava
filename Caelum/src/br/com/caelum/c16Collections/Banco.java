package br.com.caelum.c16Collections;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> contas = new ArrayList<>();
	
	public void adiciona(Conta c) {
		contas.add(c);
	}
	
	public Conta pega (int i) {
		return contas.get(i);
	}
	
	public int pegaQuatidadeDeContas() {
		return contas.size();
	}
	
	public Conta pegaPorNome(String nome) {
		for (Conta conta : contas) {
			if(conta.getNome().equals(nome))
				return conta;
		}
		return null;
	}
	
	
}
