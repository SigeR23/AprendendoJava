package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modal.Contato;

@SuppressWarnings("serial")
@WebServlet(name = "adicionaContatoServlet", value = "/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String data = request.getParameter("dataNascimento");
		Calendar dataNascimento = null;
		
		try {
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(data));
				
			
		} catch (ParseException e) {
			out.println("Erro na conversão de data");
			return;
		}
		
		Contato contato  = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);
		
		new ContatoDAO().adicionaContato(contato);
		
		RequestDispatcher rd = request.getRequestDispatcher("/contato-adicionado.jsp");
		rd.forward(request, response);
	}
}
