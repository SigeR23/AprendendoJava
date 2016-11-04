package br.com.caelum.c10Interfaces;



public class AtualizaContas {
private double totalAtualizado = 0;
	
	public void atualiza (Conta c, double taxa) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		double valorAtualizado = 0;
		if (c instanceof ContaCorrente) {
			c.atualiza(taxa);
			valorAtualizado = c.getSaldo() * taxa * 2;
		
		} else 
			if (c instanceof ContaPoupanca) {
				c.atualiza(taxa);
				valorAtualizado = c.getSaldo() * taxa * 3;
			}
		System.out.println("Novo Saldo: " + c.getSaldo());
		totalAtualizado += valorAtualizado;	
	}
	
	public double getTotalAtualizado() {
		return this.totalAtualizado;
	}
}
