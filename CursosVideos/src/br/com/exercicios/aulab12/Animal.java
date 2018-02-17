package br.com.exercicios.aulab12;

public abstract class Animal {
	// Atibrutos de Animal
	protected float peso;
	protected int idade;
	protected int membros;

	// Metodos Publicos de Aninal
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();

	// Metodos Especiais
	public float getPeso() {
		return peso;
	}

	public int getIdade() {
		return idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

}
