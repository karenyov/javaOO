package br.com.casadocodigo.livraria.produtos;

import java.util.Comparator;

/**
 * @author Karen 26 de mai de 2018
 */
public class ComparadorPorNome implements Comparator<Livro> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Livro o1, Livro o2) {
		// TODO Auto-generated method stub
		return o1.getNome().compareTo(o2.getNome());
	}

}
