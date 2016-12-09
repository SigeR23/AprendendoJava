package br.com.siger.jogodaforca.utils;

public class GerarRandom {

	public static int gerarNumeroRandom(int min, int max) {
		int intervalo = max - min;
		return (int) (Math.random() * intervalo) + min;
	}
}
