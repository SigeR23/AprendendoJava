package br.com.jogodavelha;

public class Tabuleiro {
	
	private char[][] matriz;
	
	public Tabuleiro() {
		matriz = new char[3][3];
		
		zerar();
	}

	private void zerar() {
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = ' ';
			}
		}
	}

	public void imprime() {
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				
				if(j < matriz[0].length - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if(i < matriz.length - 1) {
				System.out.println("---------");
			}
		}
	}
		

	public boolean efetuarJogada(Jogada jogada, char simbolo) {
		int i = jogada.getI();
		int j = jogada.getJ();
		
		if(i < 0 || j < 0 || i > matriz.length || j > matriz[0].length)  {
			throw new JogadaInvalidaException("A jogada '" + i + ", " + j + " é inválida");
		}
		if (matriz[i][j] != ' ') {
			throw new JogadaInvalidaException("A jogada '" + i + ", " + j + " já foi feita");
		}
		matriz[i][j] = simbolo;
		return isSequenciaEncotrada();
	}

	private boolean isSequenciaEncotrada() {
		if (matriz [0][0] != ' ' && matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2])
			return true;
		if (matriz [0][0] != ' ' && matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0])
			return true;
		if (matriz [0][0] != ' ' && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2])
			return true;
		if (matriz [1][0] != ' ' && matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2])
			return true;
		if (matriz [2][0] != ' ' && matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2])
			return true;
		if (matriz [2][0] != ' ' && matriz[2][0] == matriz[1][1] && matriz[1][1] == matriz[0][2])
			return true;
		if (matriz [0][1] != ' ' && matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1])
			return true;
		if (matriz [0][2] != ' ' && matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2])
			return true;
		return false;
	}

	public boolean isCompleto() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

}
