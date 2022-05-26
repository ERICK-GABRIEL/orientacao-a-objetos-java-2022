package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Atleta {

	private String name;
	private byte age;
	private int qWin;
	private int qLoss;
	
	public Atleta() {
		
	}
	
	public Atleta(String name, byte age, int qWin, int qLoss) {
		super();
		this.name = name;
		this.age = age;
		this.qWin = qWin;
		this.qLoss = qLoss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getqWin() {
		return qWin;
	}

	public void setqWin(int qWin) {
		this.qWin = qWin;
	}

	public int getqLoss() {
		return qLoss;
	}

	public void setqLoss(int qLoss) {
		this.qLoss = qLoss;
	}
	
	public void comemorarWin() {
		System.out.println(getName()+" Thanks good!");
		this.qWin++;
	}
	
	public void learnigWithLoss() {
		System.out.println("Try on next!");
		this.qLoss++;
	}
	
}
