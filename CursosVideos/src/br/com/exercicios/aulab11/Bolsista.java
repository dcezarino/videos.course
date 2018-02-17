package br.com.exercicios.aulab11;

public class Bolsista extends Aluno{
	// Atributos
	private float bolsa;

	// Metodos Publicos
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}

	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " e bolsista! Pagamento facilitado");
	}

	// Metodos Especiais
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}
