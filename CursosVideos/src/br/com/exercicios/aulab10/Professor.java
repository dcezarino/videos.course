package br.com.exercicios.aulab10;

public class Professor extends Pessoa {

	// Atributos
	private String especialidade;
	private float salario;


	// Metodos Publicos
	public void receberAum(float aum) {
		this.salario += aum;
	}

	// Metodos Especiais
	public String getEspecialidade() {
		return especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
