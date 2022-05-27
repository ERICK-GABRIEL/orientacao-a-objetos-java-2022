package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Zumbi implements Individuo{

	@Override
	public void alimentar(String alimento) {
		System.out.println("Eu me alimento apenas de cérebros de Java Senior");
		
	}

	@Override
	public void locomover() {
		System.out.println("Sou lento, deixo voce correr, vou te pegar de qualquer jeito");
		
		
	}

	@Override
	public void comunicar(String conteudo) {
		
	  System.out.println("Arrrggsssss...aaaa?");
		
		
	}

}
