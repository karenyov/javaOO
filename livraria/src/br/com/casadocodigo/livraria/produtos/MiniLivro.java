package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * @author Karen 4 de abr de 2018
 */
public class MiniLivro extends Livro implements Promocional {

	/**
	 * @param autor
	 */
	public MiniLivro(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}

}
