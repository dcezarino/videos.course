package br.com.exercicios.aula03;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}

	}

	// this e o nome do objeto que chamou, o c1 ou o c2 chamou o metodo tampar,
	// entao o
	// this sera substituido pelo c1 ou c2 que esta chamando o metodo
	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

}
