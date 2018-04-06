package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * @author Karen 3 de abr de 2018
 */
public class Ebook extends Livro implements Promocional {

	private String waterMark;

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}

	/**
	 * @param autor
	 */
	public Ebook(Autor autor) {
		super(autor);
	}

	/**
	 * @return the waterMark
	 */
	public String getWaterMark() {
		return waterMark;
	}

	/**
	 * @param waterMark
	 *            the waterMark to set
	 */
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
