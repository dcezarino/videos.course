package br.com.exercicios.relogio;

public class Executar {

	public static void main(String[] args) {

		Relogio R1 = new Relogio();
		R1.cor = "Azul";
		R1.material = "Aluminio";
		R1.modelo = "Quazart";
		R1.formato = "Redondo";
		R1.bateria = 19;
		R1.ligar();
		R1.trocarpilha();
		R1.ajustarhorario(12.00);
		R1.ativaralarme();
		R1.imprimir();
		
	}

}
