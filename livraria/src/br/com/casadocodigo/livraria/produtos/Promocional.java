package br.com.casadocodigo.livraria.produtos;

/**
 * @author Karen 5 de abr de 2018
 */
@FunctionalInterface //possui um unico m�todo abstrato
public interface Promocional {
	boolean aplicaDescontoDe(double porcentagem);
}
