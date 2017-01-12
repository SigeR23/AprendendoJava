package br.com.caelum.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.caelum.connectionfactory.ConnectionFactory;
import br.com.caelum.dao.DAOException;
@WebFilter("/*")
public class FiltroDeConexões implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		Connection con = ConnectionFactory.getInstance().getConnection();
		req.setAttribute("conexao", con);
		
		chain.doFilter(req, res);
		
		try {
			con.close();
		} catch (SQLException e) {
			throw new DAOException("erro ao fechar a conexão com o db");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
