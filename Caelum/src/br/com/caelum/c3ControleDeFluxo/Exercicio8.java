package br.com.caelum.c3ControleDeFluxo;

public class Exercicio8 {
	public static void main (String[] args) {
		for (int a = 1; a <= 1; a++) {
			System.out.print(1*a + " ");
			System.out.println();
			
			for (int b = 1; b <= 2; b++) {
				System.out.print(2*b + " ");
				if (b == 2) {
					System.out.println();
					
					for (int c = 1; c <= 3; c++) {
						System.out.print(c*3 + " ");
						if (c == 3) {
							System.out.println();
							
							for (int d = 1; d <= 4; d ++) {
								System.out.print(d*3 + " ");
								if (d == 4) {
									System.out.println();
									
									for (int e = 1; e <= 5; e++){
										System.out.print(e*5 + " ");
									}
								}
							}
						}
					}
				}	
			}	
		}
	}
}
