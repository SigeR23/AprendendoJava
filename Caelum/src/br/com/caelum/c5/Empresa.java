package br.com.caelum.c5;

public class Empresa {
	public String nome;
	public String cnpj;
	public int limiteFuncionarios = 2;
	public Funcionario[] empregados = new Funcionario[limiteFuncionarios];
	public int quantidadeFuncionarios = 0;
	
	public void adiciona(Funcionario f) {
		if(this.quantidadeFuncionarios < limiteFuncionarios) {
			this.empregados[this.quantidadeFuncionarios] = f;
			this.quantidadeFuncionarios++;
		} else {
				expandirEmpregados(f);
				
		}
	}
	
	
	public void expandirEmpregados(Funcionario fun) {
		Funcionario[] empregados2 = new Funcionario[limiteFuncionarios + 10];
		for (int i = 0; i < empregados.length; i++) {
			empregados2[i] = empregados[i];
		}
		if(empregados2[empregados2.length-1] == null) {
			empregados2[this.quantidadeFuncionarios] = fun;
			this.quantidadeFuncionarios++;
		} else {
			System.out.println("Empresa Lotada");
		}
	}
	public void mostraEmpregados() {
		for (Funcionario f : empregados) {
			f.mostra();
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