package br.com.exercicios.aulab11;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(); A classe Pessoa nao pode ser instanciada, pois e abstrata
		Visitante v1 = new Visitante();
//		v1.setNome("Juvenal");
//		v1.setIdade(22);
//		v1.setSexo("M");
//		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setCurso("Informatica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();

		
	}

}
