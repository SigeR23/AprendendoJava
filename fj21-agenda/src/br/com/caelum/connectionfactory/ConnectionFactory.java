package br.com.caelum.connectionfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static ConnectionFactory instance  = null;
	
	private ConnectionFactory() {
		
	}
	
	public static ConnectionFactory getInstance() {
		if(instance == null)
			instance = new ConnectionFactory();
		return instance;
	}
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
