package br.com.exercicios.aulab09;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];

		
		p[0] = new Pessoa("Maria", 22, "F");
		p[1] = new Pessoa("Jose", 20, "M");
		
		l[0] = new Livro("Aprendendo a Programar", "Pedro de Mello", 500, p[0]);
		l[1] = new Livro("Programacao para Iniciantes", "Jose Carlos", 900, p[1]);
		l[2] = new Livro("Redes de Computadores", "Samuel Ferreira Junior", 300, p[0]);
		
		
		l[0].abrir();
		l[0].folhear(0);
		l[0].voltarPag();
		l[0].fechar();
		System.out.println(l[0].detalhes());


	}

}
