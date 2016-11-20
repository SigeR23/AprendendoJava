package br.com.caelum.c16Collections;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
		;
	}

	@Override
	public int compareTo(ContaPoupanca outra) {

		return this.getNome().compareToIgnoreCase(outra.getNome());
	}

	/* ordenar pelo numero da conta
	 * public int compareTo(ContaPoupanca outra) {
	 * 
	 * return Integer.compare(this.numeroDaConta, outra.numeroDaConta); }
	 */

}
