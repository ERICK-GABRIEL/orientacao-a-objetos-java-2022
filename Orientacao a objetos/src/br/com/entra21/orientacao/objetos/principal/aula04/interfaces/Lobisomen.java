package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Lobisomen implements Individuo {

	@Override
	public void alimentar(String alimento) {
		System.out.println("Me alimento de sangue de T.I.s");

	}

	@Override
	public void locomover() {
		System.out.println("Eu me locomovo com minhas 2 pernas e minhas 2 m�os");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("S� me comunico com a Lua!!");
		
	}

}
