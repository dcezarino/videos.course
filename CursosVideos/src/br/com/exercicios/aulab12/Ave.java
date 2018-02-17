package br.com.exercicios.aulab12;

public class Ave extends Animal {
	// Atributos
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
	}

	// Metodos Publicos
	public void fazerNinho() {
		System.out.println("Construindo Ninho");
	}

	// Metodos Especiais
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

}
