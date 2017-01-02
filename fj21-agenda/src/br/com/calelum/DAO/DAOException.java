package br.com.calelum.DAO;

@SuppressWarnings("serial")
public class DAOException extends RuntimeException {
	
	public DAOException(String mensagem) {
		super(mensagem);
	}
}
