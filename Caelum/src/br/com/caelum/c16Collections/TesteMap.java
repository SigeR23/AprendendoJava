package br.com.caelum.c16Collections;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.c11Exceções.ValorInvalidoException;

/**
 * 
 * @author SigeR
 * 	testando Map
 */
public class TesteMap {
	
	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		
		try {
			c1.deposita(500);
			c2.deposita(1000);
			
		} catch (ValorInvalidoException e) {
			e.getMessage();
		}
		
		Map<String, Conta> mapaDeContas = new HashMap<>();
		mapaDeContas.put("Gerente", c1);
		mapaDeContas.put("Diretor", c2);
		
		Conta contaDoDiretor =  mapaDeContas.get("Diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}
}
