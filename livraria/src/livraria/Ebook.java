package livraria;

/**
 * @author Karen 3 de abr de 2018
 */
public class Ebook extends Livro {

	private String waterMark;

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		return super.aplicaDescontoDe(porcentagem);
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
