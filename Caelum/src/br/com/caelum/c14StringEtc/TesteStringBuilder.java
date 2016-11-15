package br.com.caelum.c14StringEtc;
/**
 * 
 * @author SigeR
 * testando a classe StringBuilder
 */
public class TesteStringBuilder {
	public static void main(String[] args) {
		StringBuilder string = new StringBuilder("anotaram a data da maratona");
		string.reverse();
		System.out.println(string);
	}
}
