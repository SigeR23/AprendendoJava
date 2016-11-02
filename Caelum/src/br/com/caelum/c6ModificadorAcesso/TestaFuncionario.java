package br.com.caelum.c6ModificadorAcesso;

public class TestaFuncionario {
	public static void main(String[] args)  {
		Funcionario f = new Funcionario();
		
		f.setNome("Zé");
		f.setSalario(5000);
		try {
			f.setDtEntrada("21/11/1992");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(f.getSalario());
		System.out.println("Data de Entrada: " + f.getData());
		f.mostra();
	}
}
