package br.com.caelum.c6ModificadorAcesso;

public class PessoaFisica {
	private String cpf;
	
	PessoaFisica(String cpf) {
		if (this.validaCpf(cpf)) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF inv�lido");
		}
	}
	
	public boolean validaCpf(String cpf) {
		return true;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}
