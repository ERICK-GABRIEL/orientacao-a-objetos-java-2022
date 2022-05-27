package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Capivara implements Individuo {

	// Quando eu nao escvrevo meu construtor vazio, é porque ele ja tem por padrao
	// porem, quando eu crio um construtor costumizado eu perco meu construtor
	// padrao e sou obrigado a criar um manualmente

	@Override
	public void alimentar(String alimento) {
		System.out.println("A capivara come mato e " + alimento);

	}

	@Override
	public void locomover() {
		System.out.println("A capivara anda, corre e nada");

	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("A capivara não se comunica");

	}

}
