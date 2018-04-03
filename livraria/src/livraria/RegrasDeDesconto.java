package livraria;

/**
 * @author Karen 2 de abr de 2018
 */
public class RegrasDeDesconto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		Livro livro = new Livro(autor);
		livro.setValor(59.90);

		if (!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no livro não pode ser maior do que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);

		if (!ebook.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no ebook não pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}

	}

}
