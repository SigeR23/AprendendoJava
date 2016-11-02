package br.com.caelum.c7HerancaPolim;

public class TestaBanco {
	public static void main(String[] args) {
		Banco b  = new Banco(3);
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		b.adiciona(c);
		b.adiciona(cc);
		b.adiciona(cp);
		
		Conta c2 = new Conta();
		
		if(b.pegaConta(c2) != null) { 
			System.out.println("Numero da Conta" + c2.getNumeroDaConta());
			
		} else {
			System.out.println("Essa Conta não existe");
		}
		
		if(b.pegaConta(cc) != null) { 
			System.out.println("Numero da Conta: " + b.pegaConta(cc).getNumeroDaConta());
			
		} else {
			System.out.println("Essa Conta não existe");
		}
		
		b.atualizaGeral();
		
		c.deposita(100);
		cc.deposita(100);
		cp.deposita(100);
		
		b.atualizaGeral();
	}
}
