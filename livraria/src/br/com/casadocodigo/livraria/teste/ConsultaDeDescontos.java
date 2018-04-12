package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.GerenciadorDeCupons;

/**
 * @author Karen 12 de abr de 2018
 */
public class ConsultaDeDescontos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

		Double desconto = gerenciador.validaCupom("cab11");

		if (desconto != null) {
			System.out.println("Cupom de desconto valido.");
			System.out.println("Valor " + desconto);
		} else {
			System.out.println("Esse cupom não existe.");
		}

	}

}
