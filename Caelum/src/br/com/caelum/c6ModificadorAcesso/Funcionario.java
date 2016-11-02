package br.com.caelum.c6ModificadorAcesso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
	private static int id = 1;
	private int identificador = id;
	private String nome;
	private String departamento;
	private double salario;
	private Date dtEntrada = new Date();
	private String rg;
	
	public Funcionario () {
		Funcionario.id++;
	}
	
	public Funcionario (String nome) {
		this.nome = nome;
		Funcionario.id++;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/*public String getDtEntrada() {
		return this.dtEntrada.mostra();
	}*/

	public void setDtEntrada(String data) {
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dtEntrada = dt.parse(data);
		} catch (ParseException e) {
			System.out.println("Data Inválida");
			e.printStackTrace();
		}
	}
	
	public String getData() {
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		String dataEmString = dt.format(dtEntrada);
		return dataEmString;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdentificador () { 
		return this.identificador;
	}
	
	public void recebeAumento(double valor) {
		this.salario += valor;
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salaraio: " + this.salario);
		System.out.println("Data de entrada no banco: " + this.getData());
		System.out.println("RG: " + this.rg);
	}
}
