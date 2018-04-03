package livraria;

/**
 * @author Karen 3 de abr de 2018
 */
public class LivroFisico extends Livro {

	/**
	 * @param autor
	 */
	public LivroFisico(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
}
