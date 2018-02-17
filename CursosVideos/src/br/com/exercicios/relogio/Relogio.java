package br.com.exercicios.relogio;

public class Relogio {
	String cor;
	String material;
	String modelo;
	String formato;
	int bateria;
	Double horas;
	boolean ligado;
	String alerta;

	void ligar() {
		this.ligado = true;
	}

	void desligar() {
		this.ligado = false;
	}

	void ativaralarme() {
		if (this.ligado == true && this.horas != null) {
			alerta = "O relogio esta ligado e programado para despertar as " + this.horas;
		} else {
			alerta = "Favor ligar o relogio e programar um horario para ativar o alarme";
		}
	}

	void desativaralarme() {
		this.ligado = false;
	}

	void ajustarhorario(Double horas) {
		this.horas = horas;
	}

	void trocarpilha() {
		if (this.bateria < 20) {
			System.out.println("Troque a pilha do relogio");
		}
		this.ligado = false;
	}

	void imprimir() {
		System.out.println("Relogio Ligado? " + this.ligado);
		System.out.println("Horario: " + this.horas);
		System.out.println("Cor: " + this.cor);
		System.out.println("Material: " + this.material);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Formato: " + this.formato);
		System.out.println("Porcentagem Bateria: " + this.bateria);
		System.out.println(alerta);

	}

}
