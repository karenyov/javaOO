package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;

/**
 * @author Karen 5 de abr de 2018
 */
public class Revista implements Produto, Promocional {

	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;

	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.1) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	
	@Override
	public int compareTo(Produto outro) {
		return (int) (this.getValor() - outro.getValor());
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return the editora
	 */
	public Editora getEditora() {
		return editora;
	}

	/**
	 * @param editora
	 *            the editora to set
	 */
	public void setEditora(Editora editora) {
		this.editora = editora;
	}

}
