package br.com.exerciciosaulab14;

public class Gafanhoto extends Pessoa{
	
	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
			
	public String getLogin() {
		return login;
	}
	
	public int getTotAssistido() {
		return totAssistido;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	// super chama o toString de Pessoa
	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + "\nlogin="  + login + ", totAssistido=" + totAssistido + "]";
	}

}
