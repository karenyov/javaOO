package livraria;

/**
 * @author Karen
 * 30 de mar de 2018
 */
public class ComparandoReferencias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789.10";
		
		Autor autor2 = new Autor();
		autor2.nome = "Rodrigo Turini";
		autor2.email = "rodrigo.turini@caelum.com.br";
		autor2.cpf = "123.456.789.10";
		
		if (autor == autor2) {
			System.out.println("Iguais, mesmo autor!");
		} else {
			System.out.println("hein!? Por que diferentes?");
		}

	}

}
