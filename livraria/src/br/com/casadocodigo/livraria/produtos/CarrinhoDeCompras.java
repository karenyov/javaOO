package br.com.casadocodigo.livraria.produtos;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Karen 3 de abr de 2018
 */
public class CarrinhoDeCompras {

	private double total;
	private List<Produto> produtos;
	private int contador = 0;

	/**
	 * 
	 */
	public CarrinhoDeCompras() {

		this.produtos = new ArrayList<Produto>();
	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public double getTotal() {
		return total;
	}
}
