package br.com.caelum.dao;

@SuppressWarnings("serial")
public class DAOException extends RuntimeException {
	
	public DAOException(String mensagem) {
		super(mensagem);
	}
}
