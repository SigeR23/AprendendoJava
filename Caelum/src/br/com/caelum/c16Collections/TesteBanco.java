package br.com.caelum.c16Collections;
/**
 * 
 * @author SigeR
 *	testando a classe Banco
 */
public class TesteBanco {
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente();
		c.setNome("Clara");
		
		Conta c1 = new ContaCorrente();
		c1.setNome("Luana");
		
		Banco banco = new Banco();
		banco.adiciona(c);
		banco.adiciona(c1);
		
		
		
		System.out.println("Total de Contas: " + banco.pegaQuatidadeDeContas());
		System.out.println("Conca C: " + banco.pega(0));
		System.out.println("Conta C: " + banco.pegaPorNome("Luana"));
	}
}
