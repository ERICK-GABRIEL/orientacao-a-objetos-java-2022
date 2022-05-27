package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Velocista;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitos.poo.Ponto;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitos.poo.Reta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Aviao;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Lobisomen;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Planta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Zumbi;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, então é um obj
	// porem o System.in é uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;
		do {
			System.out.println(" Escolha uma opção");
			System.out.println("0 - Sair ");
			System.out.println("1 - Classes");
			System.out.println("2 - Heran�a");
			System.out.println("3 - Polimorfismo");
			System.out.println("4 - Conceitos POO");
			System.out.println("5 - Polimorfismo com Interface");

			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				aprenderClassesObjetos();
				break;
			case 2:
				aprendendoHeranca();
				break;

			case 3:
				aprenderPolimorfismo();
				aprenderClassesPolimorfismo();
				break;

			case 4:
				aprenderConceitosPOO();
				break;

			case 5:
				aprenderPolimorfismoComInterface();
				break;

			default:
				System.out.println("Digite uma op��o v�lida!!");
				break;

			}

		} while (option != 0);

	}

	public static void aprenderClassesObjetos() {
		Funcionario funcionario1 = new Funcionario();

		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		System.out.println("Nome dela = " + professoraIngles.getNome());

		professoraIngles.setNome("Isabelle 2");

		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela � " + professoraIngles.getIdade());

		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		Aluno alunoTeste = new Aluno();

		Aluno outroAluno = new Aluno();

		Aluno alunoNovato = new Aluno();

		Aluno alunoObjeto;

		alunoObjeto = new Aluno();

		alunoObjeto.idade = 18;

		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		/*
		 * System.out.println("Qual o nome do aluno novato?");
		 * alunoNovato.nome=entrada.next();
		 * 
		 * System.out.println("Qual a idade do "+alunoNovato.nome+"?");
		 * alunoNovato.idade=entrada.nextByte();
		 * 
		 * System.out.println("Bem vindo "+alunoNovato.nome);
		 */

	}

	public static void aprendendoHeranca() {

	}

	public static void aprenderPolimorfismo() {
		Atleta messi = new Atleta();
		messi.comemorarWin();
		messi.learnigWithLoss();

		Nadador cleidomar = new Nadador("Cleidomar", (byte) 38, 15, 14, "mar", "sunga");
		cleidomar.comemorarWin();
		cleidomar.learnigWithLoss();
		cleidomar.setName("Cleidomar Rovson");
	}

	public static void aprenderClassesPolimorfismo() {

		// padrão de polimorfismo para comportamentos(métodos) é herdar.

		// segunda forma do polimorfismo é fazer completamente os
		// comportamentos(métodos) do meu jeito.

		// terceira forma do polimorfismo é aproveitar a minha herança e fazer um
		// diferencial.

		Atleta cr7 = new Atleta();

		cr7.setName("Cristiano Ronaldo");
		cr7.comemorarWin();

		System.out.println("----------------------------");

		Nadador michaelPhelps = new Nadador();

		michaelPhelps.setName("Michael Phelps");

		Nadador sergioMichael = new Nadador("Sérgio Michael", (byte) 39, 23, 40, "Piscína", "Sunga e Touca");

		sergioMichael.comemorarWin(); // procura primeiro na minha classe Nadador, se não tiver busca na herança.

		michaelPhelps.comemorarWin();

		System.out.println("----------------------------");

		Velocista usainBolt = new Velocista();

		usainBolt.setName("Usain Bolt");

		usainBolt.comemorarWin();

		System.out.println("----------------------------");

	}

	public static void aprenderConceitosPOO() {

		// A classe ponto tem alta COES�O pois ele � preciso nas suas responsabilidades
		Ponto pontoAlto = new Ponto(30, 10000);
		Ponto esquerdaBaixo = new Ponto(-50, -500);

		// A classe Reta � agregada por pontos que podem nao estar inicializadas
		// A associacao de reta e ponto e de um para muitos respectadores
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto, esquerdaBaixo);
	}

	public static void aprenderPolimorfismoComInterface() {

		Humano rafael = new Humano();
		rafael.setNome("Rafael");

		rafael.apresentarSe();
		rafael.alimentar("Pizza");

		Gato vezu = new Gato("vezu", new Pessoa("Rubem", (byte) 33, ""));

		vezu.alimentar("Ra��o");
		vezu.comunicar("Quero ra��o!");

		Capivara robson = new Capivara();
		robson.alimentar("�gua");
		robson.comunicar("");
		robson.locomover();

		Planta maracuja = new Planta("Passiflora edulis Sims");

		maracuja.alimentar("Carne");
		maracuja.comunicar("T� fazendo Sol hoje?");
		maracuja.locomover();
		
		Zumbi tsunami =  new Zumbi();
		
		tsunami.alimentar("C�rebro");
		tsunami.comunicar("Quer correr?");
		tsunami.locomover();

		
		Lobisomen galvao = new Lobisomen();
		
		galvao.alimentar("Sangue");
		galvao.comunicar("Vov�?");
		galvao.locomover();
		
		Aviao comercial= new Aviao();
		comercial.setModelo("Boeing 737");
		System.out.println(comercial.freiar());
		comercial.acelerar(870.5f);
		System.out.println(comercial.getVelocidadeAtual());
	}
}