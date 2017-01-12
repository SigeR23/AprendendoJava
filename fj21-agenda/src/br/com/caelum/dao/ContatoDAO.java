package br.com.caelum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.connectionfactory.ConnectionFactory;
import br.com.caelum.modal.Contato;

public class ContatoDAO {
	
	Connection con;
	
	public ContatoDAO(Connection con) {
		this.con = con;
	}
	/**
	 * @param contato
	 * 
	 * salva o contato recebido como parametro no banco de dados
	 * 
	 */
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
		
	public Contato getContato(Contato contato) {
		String sql = "select * from contatos where id = ?";
		Contato c = null;
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setLong(1, contato.getId());
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				c = new Contato();
				c.setId(rs.getLong("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setEndereco(rs.getString("endereco"));
				Calendar data  = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				c.setDataNascimento(data);
			}
			rs.close();
			return c;
			
		} catch (SQLException e) {
			throw new DAOException("erro ao consultar um contato");
		}
	}
	/**
	 * @return List<Contato> contatos
	 * retorna todos os contatos salvos no banco de dados
	 */
	public List<Contato> getLista() {
		String sql = "select * from contatos";
		List<Contato> contatos = null;
		Contato contato  = null;
		try(ResultSet rs = con.prepareStatement(sql).executeQuery()) { 
			contatos = new ArrayList<>();
			while(rs.next()) {
				contato = new Contato();
				
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				contatos.add(contato);
			}
			return contatos;
		} catch (SQLException e) {
			throw new DAOException("Erro ao listar todos os contatos");
		}
	}
	
	public void alterarContato(Contato contato) {
		String sql ="update contatos set nome = ?, email = ?, endereco = ?, dataNascimento = ? where id = ?";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.execute();
		} catch (SQLException e) {
			throw new DAOException("erro ao alterar um contato");
		}
		
	}

	public void excluirContato(Contato contato) {
		String sql = "delete from contatos where id = ?";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setLong(1, contato.getId());
			stmt.execute();
			
		} catch (SQLException e) {
			throw new DAOException("Erro ao excluir um contato");
		}
		
	}
}
