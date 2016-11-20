package br.com.caelum.c16Collections;

import br.com.caelum.c11Exceções.ValorInvalidoException;

public class ContaCorrente extends Conta {
	
	public void deposita(double valor) throws ValorInvalidoException {
		super.deposita(valor - 0.1);
	}
	
	public void atualiza (double taxa) {
		super.atualiza(taxa*2);;
	}
}
