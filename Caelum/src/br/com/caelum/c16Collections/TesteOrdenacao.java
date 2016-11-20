package br.com.caelum.c16Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.c11Exceções.ValorInvalidoException;

/**
 * 
 * @author SigeR
 *	
 *	testando o metodo Collections.sort em uma lista de conta poupança
 */
public class TesteOrdenacao {
	
	public static List<ContaPoupanca> contas = new ArrayList<>();
	
	public static void imprime() {
		for(int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).toString());
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws ValorInvalidoException {
		
		double min = 10.0;
		double max = 1000.0;
		
		ContaPoupanca c = new ContaPoupanca();
		c.deposita((Math.random()*(max - min)) + min);
		contas.add(c);
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.deposita((Math.random()*(max - min)) + min);
		contas.add(c1);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.deposita((Math.random()*(max - min)) + min);
		contas.add(c2);
		ContaPoupanca c3 = c;
		contas.add(c3);
		
		TesteOrdenacao.imprime();
		
		Collections.sort(contas); //ordenando
		TesteOrdenacao.imprime();		
		
		Collections.reverse(contas); //inverte
		TesteOrdenacao.imprime();
		
		Collections.rotate(contas, 1); //rotaciona de acordo com o inteiro passado
		TesteOrdenacao.imprime();
		
		Collections.shuffle(contas); //embaralha
		TesteOrdenacao.imprime();
		
		System.out.println(c.getSaldo());
	}
	
	

}
