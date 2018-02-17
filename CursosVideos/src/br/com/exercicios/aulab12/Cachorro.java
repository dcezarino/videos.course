package br.com.exercicios.aulab12;

public class Cachorro extends Mamifero {

	@Override
	public void emitirSom(){
		System.out.println("Au! Au! Au!");
	}
	
	// Metodos Publicos
	public void enterrarOsso() {
		System.out.println("Enterrando Osso");
	}

	public void abanarRabo() {
		System.out.println("Abanando Rabo");
	}

}
