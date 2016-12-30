package br.com.caelum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.modal.Contato;

public class ContatoDAO {
	
	private Connection con = null;
	
	public ContatoDAO() {
		con = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Contato contato) {

		String sql = "insert into contatos (nome, email, endereco, dataNascimento) values (?, ?, ?, ?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new DAOException("Erro ao adicionar um contato");
		}
	}
	
	public List<Contato> getLista() {
		List<Contato> contatos = new ArrayList<>();
		
		try {
			String sql = "select * from contatos";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Contato contato =  new Contato();
				
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				contatos.add(contato);
				
				
			}
			rs.close();
			stmt.close();
			
			return contatos;
		} catch (SQLException e) {
			throw new DAOException("Erro ao listar contatos");
		}
		
	}
	
	public Contato getContatoPorID(long id) {
		Contato contato = null;
		try {
			String sql = "Select * from contatos where id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			
			
			if(rs.next()) {
				contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
			
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
			}
			rs.close();
			stmt.close();
			return contato;
			
		} catch (SQLException e) {
			throw new DAOException("Erro ao consultar contato por ID");
		}
		
		
	}
	
	public void alterarContato(Contato contato) {
		
		String sql = "update contatos set nome = ?, email = ?, endereco = ?, dataNascimento = ? where id = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new DAOException("Erro ao tentar alterar os dados de um contato");
		}
	}
	
	public void excluirContatoPorID(long id) {
		
		String sql = "delete from contatos where id = ?";
		 
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, id);
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new DAOException("Erro ao excluir um contato");
		}
				
	}
}
