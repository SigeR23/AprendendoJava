package br.com.caelum.c14StringEtc;
/**
 *  Classe Testando a classe String e alguns metodos.
 * @author SigeR
 *
 * @version 1.0
 */
public class TestaString {
	// Strings são imutaveis.
	public static void main(String[] args) {
		String name = "SigeR25";
		name.replace("5", "3");
		System.out.println(name);
		name = name.replace("5", "3");
		System.out.println(name);
		System.out.println(name.charAt(0));
		System.out.println(name.codePointAt(4));
		System.out.println(name.length());
		
		if(name.contains("SigeR"));
			System.out.println("Contain \"SigeR\"");
		if(name.isEmpty()) {
			System.out.println("String vazia");
		
		}
	}

}
