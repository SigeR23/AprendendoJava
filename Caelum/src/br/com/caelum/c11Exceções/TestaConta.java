package br.com.caelum.c11Exceções;

public class TestaConta {
	public static void main(String[] args) {
		Conta c = new ContaPoupanca();
		try {
			c.deposita(0);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		try {
			c.deposita(-1);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
