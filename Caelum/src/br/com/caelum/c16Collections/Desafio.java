package br.com.caelum.c16Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 
 * @author SigeR
 *	adicionar numeros de 1 a 1000 e ordenar em ordem decrescente no TreeSet e ArrayList
 */
public class Desafio {
	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer n1, Integer n2) {
				return (n1.equals(n2)) ? 0: (n1>n2) ? -1 : 1;
			}
		});
		ArrayList<Integer> numeros2 = new ArrayList();
		
		for (int i = 1; i <= 1000; i++) {
			numeros.add(i);
			numeros2.add(i);
		}
		
		Collections.sort(numeros2);
		Collections.reverse(numeros2);
	
		for (int i : numeros) {
			System.out.println(i);
		}
		
		for (int i : numeros2) {
			System.out.println(i);
		}
	}
}
