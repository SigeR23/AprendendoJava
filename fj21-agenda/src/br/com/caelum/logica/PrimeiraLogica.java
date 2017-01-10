package br.com.caelum.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author SigeR LessIV
 * 
 * Classe que implementa a interface Logica, testanto a interface
 */
public class PrimeiraLogica implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("Executando a logica");
		System.out.println("Retornando o nome da pagina JSP");
		
		return "primeira-logica.jsp";
	}

}
