package br.com.caelum.c7;

public class AtualizaContas {
	private double totalAtualizado = 0;
	
	public void atualiza (Conta c, double taxa) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		double valorAtualizado;
		if (c instanceof ContaCorrente) {
			valorAtualizado = c.saldo * taxa * 2;
			c.saldo += valorAtualizado;
		
		} else 
			if (c instanceof ContaPoupanca) {
				valorAtualizado = c.saldo * taxa * 3;
				c.saldo += valorAtualizado;
				
			} else {
				valorAtualizado = c.saldo * taxa;
				c.saldo += valorAtualizado;
			}
		System.out.println("Novo Saldo: " + c.getSaldo());
		totalAtualizado += valorAtualizado;
	}
	
	public double getTotalAtualizado() {
		return this.totalAtualizado;
	}
}
