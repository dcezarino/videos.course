package br.com.exercicios.aulab10;

public class Funcionario extends Pessoa{

	private String setor;
	private boolean trabalhando;

	// Metodos Publicos
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}

	// Metodos Especiais
	public String getSetor() {
		return setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}
