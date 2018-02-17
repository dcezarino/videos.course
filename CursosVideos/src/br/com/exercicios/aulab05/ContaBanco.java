package br.com.exercicios.aulab05;

public class ContaBanco {
	
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public void estadoAtual() {
		System.out.println("=============================");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());

	}

	// Toda vez que a classe ContaBanco for instaciada o constructor sera iniciado
	// Construtor
	public ContaBanco() {
		this.setStatus(false);
		this.setSaldo(0);
	}

	// Metodos
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);

		if (getTipo() == "CC") {
			this.setSaldo(50);

		} else if (getTipo() == "CP") {
			this.setSaldo(150);
		}

		System.out.println("Conta aberta com sucesso!");

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta nao pode ser fechada, pois possui saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta nao pode ser fechada, pois possui debito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}

	}

	public void depositar(float v) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizaado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em um conta fechada");
		}

	}

	public void sacar(float v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada");

		}

	}

	public void pagarMensal() {
		float v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}

		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			} else {
				System.out.println("Impossivel pagar conta fechada");
			}

		}

	}

	public int getNumConta() {
		return numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDono() {
		return dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
