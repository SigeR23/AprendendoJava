package br.com.caelum.mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.logica.Logica;

/**
 * @author SigeR
 *
 * Servlet responsavel pelo controle das execu��o da logica.
 */
@SuppressWarnings("serial")
@WebServlet("/mvc")

public class ControllerServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		/**
		 * recebe como parametro a logica que ser� executada
		 */
		String parametro = req.getParameter("logica");
		/**
		 * adiciona o parametor ao final da String para obter o nome completo da classe que possui a logica a ser executada
		 */
		String nomeDaClasse ="br.com.caelum.logica." + parametro;
		
		try {
			// inicializando a classe
			Class classe = Class.forName(nomeDaClasse);
			// instanciando a classe e referenciando ela atraves de uma variavel do tipo Logica(interface)
			Logica logica = (Logica) classe.newInstance();
			//chamando a classe responsavel por executar a logica e retornar a String contento o endere�o da p�gina q ser� exeibida
			String pagina = logica.executa(req, res);
			
			req.getRequestDispatcher(pagina).forward(req, res);
		} catch(Exception e) {
			throw new ServletException("A l�gica do neg�cio causou uma exce��o", e);
		}
	}
}
