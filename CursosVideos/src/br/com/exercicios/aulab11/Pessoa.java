package br.com.exercicios.aulab11;

public abstract class Pessoa {

	// Atributos
	protected String nome;
	protected int idade;
	protected String sexo;

	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	// Metodos Publicos
	public void fazerAniversario() {
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
