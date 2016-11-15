package br.com.caelum.c14StringEtc;
/**
 * 
 * @author SigeR
 * Array para guardar qualquer obj
 */
public class GuardadorDeObjetos {
	private Object[] objetos = new Object[100];
	private int posicao = 0;
	
	public void addObject (Object o) {
		objetos[posicao] = o;
		posicao++;
	}
	
	public Object pegarUmObject(int i) {
		return objetos[i];
	}
}
