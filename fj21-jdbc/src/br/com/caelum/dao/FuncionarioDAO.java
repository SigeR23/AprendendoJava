package br.com.caelum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.modal.Funcionario;

public class FuncionarioDAO {
	
	private Connection con = null;
	
	public FuncionarioDAO() {
		con = new ConnectionFactory().getConnection();
	}
	
	public void inserirFuncionario(Funcionario f) {
		
		String sql = "insert into funcionarios (nome, usuario, senha) values (?, ?, ?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getUsuario());
			stmt.setString(3, f.getSenha());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new DAOException("erro ao inserir um funcionario");
		}
	}
	
	public Funcionario consultarFuncionarioPorID(long id) {
		
		String sql = "select * from funcionarios where id = ?";
		Funcionario funcionario = null;
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			
			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				funcionario = new Funcionario();
				funcionario.setId(rs.getLong("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setUsuario(rs.getString("usuario"));
				funcionario.setSenha(rs.getString("senha"));
			}
			
			rs.close();
			return funcionario;
			
		} catch (SQLException e) {
			throw new DAOException("Erro ao consultar um funcionario por ID");
		}
	}
	
	public void alterarFuncionario(Funcionario f) {
		
		String sql = "update funcionarios set nome = ?, usuario = ?, senha = ? where id = ?";
		
		try (PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getUsuario());
			stmt.setString(3, f.getSenha());
			stmt.setLong(4, f.getId());
			
			stmt.execute();
			
		} catch (SQLException e) {
			throw new DAOException("Error ao alterar os dados de um funcionario");
		}
	}

	public void deletarFuncionarioPorID(long id) {

		String sql = "delete from funcionarios where id = ?";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setLong(1, id);
			stmt.execute();
		} catch (SQLException e) {
			throw new DAOException("Erro ao deletar um funcionario.");
		}
	}

	public List<Funcionario> listarFuncionarios() {
		List<Funcionario> funcionarios = null;
		Funcionario f  = null;
		String sql = "select * from funcionarios";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			funcionarios  = new ArrayList<>();

			while(rs.next()) {
				f = new Funcionario();
				f.setId(rs.getLong("id"));
				f.setNome(rs.getString("nome"));
				f.setUsuario(rs.getString("usuario"));
				f.setSenha(rs.getString("senha"));
				
				funcionarios.add(f);
			}
			rs.close();
			return funcionarios;
		} catch (SQLException e) {
			throw new DAOException("Erro ao listar funcionarios");
		}
	}
}
