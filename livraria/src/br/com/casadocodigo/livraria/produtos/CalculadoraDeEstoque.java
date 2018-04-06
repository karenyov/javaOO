package br.com.casadocodigo.livraria.produtos;

/**
 * @author Karen 29 de mar de 2018
 */
public class CalculadoraDeEstoque {

	public static void main(String[] args) {

		double soma = 0;

		for (double i = 0; i < 35; i++) {
			soma += 59.90;

		}

		System.out.println("O total em estoque é " + soma);

		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma >= 200) {
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom");
		}
	}
}
