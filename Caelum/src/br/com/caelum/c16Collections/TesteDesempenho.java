package br.com.caelum.c16Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
/**
 * 
 * @author SigeR
 *
 * comparando desempenho de um ArrayList e um hashSet
 */
public class TesteDesempenho {

	public static void main(String[] args) {
		// testando ArrayList
		Collection<Integer> colecao = new ArrayList<>();
		
		int tamanho = 30000;
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < tamanho; i++) {
			colecao.add(i);
		}
		
		System.out.println("ArrayList.add tempo: " + (System.currentTimeMillis() - inicio));
		inicio = System.currentTimeMillis();
		
		for(int i  = 0; i < tamanho; i++) {
			colecao.contains(i);
		}
		
		System.out.println("ArrayList.contains tempo: " + (System.currentTimeMillis() - inicio));
		
		//testando HashSet
		Collection<Integer> colecao2 = new HashSet<>();
		inicio = System.currentTimeMillis();
		
		for(int i = 0; i < tamanho; i++) {
			colecao2.add(i);
		}
		
		System.out.println("HashSet.add tempo: " + (System.currentTimeMillis() - inicio));
		inicio = System.currentTimeMillis();
		
		for(int i  = 0; i < tamanho; i++) {
			colecao2.contains(i);
		}
		
		System.out.println("HashSet.contains tempo: " + (System.currentTimeMillis() - inicio));
		
		
	}

}
