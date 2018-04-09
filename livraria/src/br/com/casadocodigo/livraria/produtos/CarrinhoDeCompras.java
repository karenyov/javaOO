package br.com.casadocodigo.livraria.produtos;

/**
 * @author Karen 3 de abr de 2018
 */
public class CarrinhoDeCompras {

	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produtos[contador] = produto;
		contador++;
		total += produto.getValor();
	}

	public void getProdutos() {
		/*
		 * for (Produto produto : produtos) { if (produto != null) {
		 * System.out.println(produto.getValor()); } }
		 */

		for (int i = 0; i <= produtos.length; i++) {
			try {
				Produto produto = produtos[i];
				if (produto != null) {
					System.out.println(produto.getValor());
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("deu exception no indice: " + i);
			} catch (NullPointerException e) {
				System.out.println("A array não foi instanciado!");
			}
		}

		System.out.println("Fui executado!");
	}

	public double getTotal() {
		return total;
	}
}
