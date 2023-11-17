package conta_bancaria.model;

public class Conta {

	// Define os atributos/Modelo da Classe
	private int numero; // private define que só sejam manipulados dentro da classe Conta
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	// Método construtor com o mesmo nome da Classe
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	// Cria métodos de Getters e Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// Método auxiliar sacar
	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\nSaldo insuficiente");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	// Método auxiliar depositar
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	// Método auxiliar visualizar
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1 -> tipo = "Conta Corrente";
		case 2 -> tipo = "Conta Poupança";
		}

		System.out.println("\n\n*******************");
		System.out.println("Dados da Conta: ");
		System.out.println("\n\n*******************");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular da Conta: " + this.titular);
		System.out.println("Saldo da Conta: " + this.saldo);
	}

}
