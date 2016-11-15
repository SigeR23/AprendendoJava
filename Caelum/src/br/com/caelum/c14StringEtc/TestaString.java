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
		name = name.replace("5", "3"); // troca os caracteres 5 por 3
		System.out.println(name);
		System.out.println(name.charAt(0)); // imprime apenas o caracter na posicao 0
		System.out.println(name.codePointAt(4)); //imprime o codigo ASCII do caracter na posicao 4
		System.out.println(name.length()); //imprime o tamanho da string
		
		if(name.contains("SigeR")); // verifica se a string contem a sequencia de caracteres "SigeR"
			System.out.println("Contain \"SigeR\"");
		if(name.isEmpty()) {
			System.out.println("String vazia");
		
		}
		imprimeCaracterACaracter("anotaram a data da maratona");
		imprimeCaracterACaracterAoContrario("anotaram a data da maratona");
		
		name = "Socorram-me subi no onibus em Marrocos";
		imprimeSplit(name.split("\\s"));
	}
	
	public static void imprimeCaracterACaracter(String s) {
		for(int i = 0;  i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	public static void imprimeCaracterACaracterAoContrario(String s) {
		for (int i = (s.length() -1); i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	public static void imprimeSplit(String[] s) {
		
		for(int i = (s.length -1); i >= 0; i--) {
			System.out.print(s[i] + " ");
		}
	}

}
