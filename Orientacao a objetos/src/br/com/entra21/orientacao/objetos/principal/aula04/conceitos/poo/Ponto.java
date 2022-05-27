package br.com.entra21.orientacao.objetos.principal.aula04.conceitos.poo;

public class Ponto {

	private float cordenadaX;
	private float cordenadaY;

	public Ponto() {
		super();
	}

	public Ponto(float cordenadaX, float cordenadaY) {
		super();
		this.cordenadaX = cordenadaX;
		this.cordenadaY = cordenadaY;
	}

	public float getCordenadaX() {
		return cordenadaX;
	}

	public void setCordenadaX(float cordenadaX) {
		this.cordenadaX = cordenadaX;
	}

	public float getCordenadaY() {
		return cordenadaY;
	}

	public void setCordenadaY(float cordenadaY) {
		this.cordenadaY = cordenadaY;
	}

}
