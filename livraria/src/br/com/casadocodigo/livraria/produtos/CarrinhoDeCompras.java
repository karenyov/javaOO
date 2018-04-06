package br.com.casadocodigo.livraria.produtos;

/**
 * @author Karen 3 de abr de 2018
 */
public class CarrinhoDeCompras {

	private double total;

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}
}
