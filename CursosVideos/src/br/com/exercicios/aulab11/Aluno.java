package br.com.exercicios.aulab11;

// Classe final nao pode ser extendida por outras classes, ela nao pode ter filhos
public class Aluno extends Pessoa {
	// Atributos
	private int matricula;
	private String curso;

	// Metodos Publicos
	// Metodo final nao pode ser sobreposto
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno " + this.nome);
	}

	// Metodos Especiais
	public int getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
