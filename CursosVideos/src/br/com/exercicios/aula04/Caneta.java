package br.com.exercicios.aula04;

public class Caneta {

	private String modelo;
	private float ponta;
	private String cor;
	public boolean tampada;
	

	// O metodo constructor e executado assim que o objeto fosse instaciado.
	// Este e o metodo construtor que deve ter o mesmo nome da minha classe, sem o void
	public Caneta(String modelo, float ponta, String cor) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void status(){
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);

		
	}

}
