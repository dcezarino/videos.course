package br.com.exercicios.aulab12;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
//		Animal n = new Animal(); // Nao pode ser instanciado, classe abstrata
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
		
		c.locomover();
		k.locomover();
		k.emitirSom();
		c.emitirSom();
		
		m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		r.locomover();
		
		
//		Mamifero m = new Mamifero();
//		Canguru c = new Canguru();
//		Cachorro k = new Cachorro();
//
//		m.setPeso(5.70f);
//		m.setIdade(8);
//		m.setMembros(4);
//		m.locomover(); // Correndo
//		m.alimentar(); // Mamando
//		m.emitirSom(); // Som de Mamifero
//
//		c.setPeso(55.30f);
//		c.setIdade(3);
//		c.setMembros(4);
//		c.locomover(); // Saltando
//		c.alimentar(); // Mamando
//		c.emitirSom(); // Som de Mamifero
//		c.usarBolsa();
//
//		k.setPeso(3.94f);
//		k.setIdade(5);
//		k.setMembros(4);
//		k.locomover(); // Correr
//		k.alimentar(); // Mamando
//		k.emitirSom(); // Som de Mamifero
//		k.abanarRabo();

	}

}
