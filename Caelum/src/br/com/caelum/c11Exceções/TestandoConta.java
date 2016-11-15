package br.com.caelum.c11Exceções;
/**
 * 
 * @author SigeR
 *	testando conta, usando toString -- 
 *	capitulo 14
 */
public class TestandoConta {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente();
		Conta cc = c;
		System.out.println(c.toString());
		if (c.equals(cc)) {
			System.out.println("Contas Iguais");
		} else {
			System.out.println("Contas Diferentes");
		}
		
		cc = new ContaCorrente();
		
		if (c.equals(cc)) {
			System.out.println("Contas Iguais");
		} else {
			System.out.println("Contas Diferentes");
		}
	}
}
