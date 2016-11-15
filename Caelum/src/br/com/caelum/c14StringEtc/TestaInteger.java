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
		
		if (x1.equals(x2)) { //usar o comparador == aqui retornara false, pq serão comparadas as referências. 
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		System.out.println(x1);
		String string = "5";
		x1 = Integer.parseInt(string);
		System.out.println(x1);
		//string = "x";
		//x2 =Integer.parseInt(string); = NumberFormatException
	}
}
