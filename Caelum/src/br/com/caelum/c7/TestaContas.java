package br.com.caelum.c7;

public class TestaContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.deposita(100);
		cp.deposita(100);
		
		System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
		
		Conta c1 = (Conta) cc;
		Conta c2 = (Conta) cp;
		
		c1.deposita(100);
		c2.deposita(100);
		
		System.out.println("Saldo da Conta Corrente: " + c1.getSaldo());
		System.out.println("Saldo da Conta Poupança: " + c2.getSaldo());
		
		c1.atualiza(1);
		c2.atualiza(1);
		
		System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
		
	}
}
