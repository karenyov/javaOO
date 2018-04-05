package principal;

import livraria.Autor;
import livraria.CarrinhoDeCompras;
import livraria.Ebook;
import livraria.LivroFisico;

/**
 * @author Karen 3 de abr de 2018
 */
public class RegistroDeVendas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");

		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

		System.out.println("Total " + carrinho.getTotal());
	}

}
