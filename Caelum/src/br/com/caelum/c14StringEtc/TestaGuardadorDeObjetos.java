package br.com.caelum.c14StringEtc;
import br.com.caelum.c11Exceções.*;
/**
 * 
 * @author SigeR
 * testando guardador De Objetos
 */
public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos gdo = new GuardadorDeObjetos();
		
		Conta c = new ContaCorrente();
		gdo.addObject(c);
		//ContaPoupanca cp = (ContaPoupanca)gdo.pegarUmObject(0);  codigo copila, mas n roda. O objeto é uma ContaCorrente.
		gdo.addObject(2);
		
	}

}
