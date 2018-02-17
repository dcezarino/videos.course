package br.com.exercicios.aulab12;

public class Mamifero extends Animal {

	// Atributos
	private String corPelo;

	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som do Mamifero");
	}
	
	// Metodos Especiais
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}


}
