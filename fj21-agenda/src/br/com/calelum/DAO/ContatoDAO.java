package br.com.calelum.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.ast.ContainerAnnotation;

import br.com.caelum.connectionfactory.ConnectionFactory;
import br.com.caelum.modal.Contato;

public class ContatoDAO {
	
	private Connection con = null;
	
	public ContatoDAO() {
		con = ConnectionFactory.getInstance().getConnection();
	}
	
	public void adicionaContato(Contato contato) {
		
		String sql = "insert into contatos (nome, email, endereco, dataNascimento) values (?, ?, ?, ?)";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			
		} catch (SQLException e) {
			throw new DAOException("Erro ao adicionar um contato");
		}
		
	}
}
