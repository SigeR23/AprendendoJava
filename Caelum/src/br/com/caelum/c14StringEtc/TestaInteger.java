package br.com.caelum.c14StringEtc;

/**
 * 
 * @author SigeR
 *	testando Integer.
 *
 */
public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if (x1.equals(x2)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		System.out.println(x1);
		x1 = Integer.parseInt("5");
		
		
	}
}
