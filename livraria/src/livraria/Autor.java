package livraria;

/**
 * @author Karen 30 de mar de 2018
 */
public class Autor {

	String nome;
	String email;
	String cpf;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do autor ");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
		System.out.println("--");

	}

}
