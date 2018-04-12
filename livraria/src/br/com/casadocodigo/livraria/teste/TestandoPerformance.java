package br.com.casadocodigo.livraria.teste;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Karen 12 de abr de 2018
 */
public class TestandoPerformance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colecao = new ArrayList<String>();

		for (int i = 0; i < 1000000; i++) {
			colecao.add("Item" + i);
		}

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			colecao.contains("Item" + i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Demorou " + tempo + "MS para executar");

	}

}
