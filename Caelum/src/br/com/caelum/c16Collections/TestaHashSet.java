package br.com.caelum.c16Collections;

import java.util.HashSet;
import java.util.Set;

public class TestaHashSet {
	
	public static void main(String[] args) {
		
		HashSet<Conta> contas = new HashSet<>();
		
		Conta c1 = new Conta();
		contas.add(c1);
		
		Conta c2 = new Conta();
		contas.add(c2);
	}
}
