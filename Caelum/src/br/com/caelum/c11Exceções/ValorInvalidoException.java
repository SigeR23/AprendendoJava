package br.com.caelum.c11Exce��es;

public class ValorInvalidoException extends Exception {
	public ValorInvalidoException(double valor) {
		super("Valor Inv�lido: " + valor);
	}
}
