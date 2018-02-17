package br.com.exercicios.aulab10;

public class Aluno extends Pessoa {

	// Atributos
	private String matr;
	private String curso;

	// Metodos Publicos
	public void cancelarMatr() {
		System.out.println("Matricula sera cancelada");
	}

	// Metodos Especiais
	public String getMatr() {
		return matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setMatr(String matr) {
		this.matr = matr;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
