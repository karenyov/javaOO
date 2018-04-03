package livraria;

/**
 * @author Karen 3 de abr de 2018
 */
public class CarrinhoDeCompras {

	private double total;

	public void adiciona(Livro livro) {
		System.out.println("Adicionando: " + livro);
		livro.aplicaDescontoDe(0.05);
		total += livro.getValor();
	}

	public double getTotal() {
		return total;
	}
}
