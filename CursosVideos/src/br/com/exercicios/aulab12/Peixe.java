package br.com.exercicios.aulab12;

public class Peixe extends Animal {
	// Atributos
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substancias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe nao faz som");
	}

	// Metodos Publicos
	public void soltarBolha() {

	}

	// Metodos Especiais
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
