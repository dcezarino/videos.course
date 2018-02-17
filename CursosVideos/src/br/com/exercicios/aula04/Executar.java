package br.com.exercicios.aula04;

public class Executar {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", 0.4f, "Amarela");
		c1.status();
		
		Caneta c2 = new Caneta("Picon", 1.5f, "Laranja");
		c2.status();

	}

}
