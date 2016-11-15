package br.com.caelum.c14StringEtc;
/**
 * 
 * @author SigeR
 * 	converter String para numero sem usar api do Java de conversão
 */
public class Desafio {
	public static void main(String[] args) {
		String numeroString  = "1270";
		
		System.out.println(Desafio.converte(numeroString));
	}
	//metodo para converter String em um int
	public static int converte(String string) {
		int numero = 0;
		int mult = 1;
		char[] caracteres = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			caracteres[i] = string.charAt(i);
		}
		for (int i = (caracteres.length - 1); i >= 0; i--) {
			numero += (caracteres[i] - '0') * mult;
			mult *= 10;
		}
 		return numero;
	}
}
