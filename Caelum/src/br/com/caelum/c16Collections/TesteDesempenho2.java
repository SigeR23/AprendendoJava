package br.com.caelum.c16Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author SigeR
 * 
 * testando desempenho entre LinkedList e ArrayList para add no inicio da lista.
 */
public class TesteDesempenho2 {

	public static void main(String[] args) {
		
		int tamanho = 300000;
		List<Integer> colecao1 = new ArrayList<>();
		
		double inicio = System.currentTimeMillis();
		
		for(int i = 0; i < tamanho; i++) {
			colecao1.add(0, i);
		}
		
		System.out.println("ArrayList.add time: " + (System.currentTimeMillis() - inicio));
		
		LinkedList<Integer> colecao2 = new LinkedList<>();
		inicio = System.currentTimeMillis();
		
		for(int i = 0; i < tamanho; i++) {
			colecao2.addFirst(i);
		}
		
		System.out.println("LinkedList.add time: " + (System.currentTimeMillis() - inicio));
	}
}
