package br.com.caelum.c6;

public class Empresa {
	private String nome;
	private String cnpj;
	private int limiteFuncionarios;
	private Funcionario[] empregados;
	private int quantidadeFuncionarios = 0;
	
	public Empresa(int n) {
		this.limiteFuncionarios = n;
		empregados = new Funcionario[n];
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getCnpj () {
		return this.cnpj;
	}
	
	public void setCnpj (String cnpj) {
		this.cnpj = cnpj;
	}
	

	public void adiciona(Funcionario f) {
		if(this.quantidadeFuncionarios < this.limiteFuncionarios) {
			this.empregados[this.quantidadeFuncionarios] = f;
			this.quantidadeFuncionarios++;
		} else {
				System.out.println("Empresa Cheia");
		}
	}
	
	public void mostraEmpregados() {
		for (Funcionario f : empregados) {
			f.mostra();
			System.out.println();
		}
	}
	
	public boolean contem(Funcionario f) {
		for (Funcionario fx : empregados) {
			if (fx == f) {
				return true;
			}
		}
		
		return false;
	}
}
