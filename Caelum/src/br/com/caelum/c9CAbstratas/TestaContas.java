package br.com.caelum.c9CAbstratas;

public class TestaContas {
	public static void main(String[] args) {
		//Conta c = new Conta(); não pode ser instanciado;
		Conta cp = new ContaPoupanca(); 
		Conta cc = new ContaCorrente();
		cp.deposita(100);
		cc.deposita(100);
		
		System.out.println("Conta: " + cp.getNumeroDaConta() + "\nSaldo: " + cp.getSaldo());
		System.out.println("Conta: " + cc.getNumeroDaConta() + "\nSaldo: " + cc.getSaldo());
		
		Conta[] contas = new Conta[10]; // new conta está criando 10 referências para instancias de ContaCorrete/Poupança.
		contas[0] = cp;
		System.out.println("Conta: " + contas[0].getNumeroDaConta() + "\nSaldo: " + contas[0].getSaldo());
	}
}
