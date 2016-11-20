package br.com.caelum.c16Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacaoNome {
	
	public static List<ContaPoupanca> contas = new ArrayList<>();
	
	public static void imprime() {
		for(int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).toString());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ContaPoupanca cc = new ContaPoupanca();
		cc.setNome("Jessica");
		
		ContaPoupanca cc2 = new ContaPoupanca();
		cc2.setNome("Arthur");
		
		ContaPoupanca cc3 = new ContaPoupanca();
		cc3.setNome("Junior");
		
		contas.add(cc);
		contas.add(cc2);
		contas.add(cc3);
		
		TesteOrdenacaoNome.imprime();
		
		Collections.sort(contas);
		
		TesteOrdenacaoNome.imprime();
		
	}

}
