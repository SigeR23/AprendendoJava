package br.com.caelum.c7;

public class TestaAtualizarContas {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(100);
		cc.deposita(100);
		cp.deposita(100);
		
		AtualizaContas ac = new AtualizaContas();
		ac.atualiza(c, 0.5);
		System.out.println("Total Atualizado: " + ac.getTotalAtualizado());
		
		ac.atualiza(cc, 0.5);
		System.out.println("Total Atualizado: " + ac.getTotalAtualizado());
		
		ac.atualiza(cp, 0.5);
		System.out.println("Total Atualizado: " + ac.getTotalAtualizado());
	}
}
