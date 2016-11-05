package br.com.caelum.c11Exceções;

public class ValorInvalidoException extends Exception {
	public ValorInvalidoException(double valor) {
		super("Valor Inválido: " + valor);
	}
}
