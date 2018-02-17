package br.com.exercicios.aulab10;

public class Pessoa {

	// Atributos
	private String nome;
	private int idade;
	private String sexo;

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	// Metodos Publicos
	public void fazerAniv() {
		this.idade++;
	}

	// Metodos Especiais
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
