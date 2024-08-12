package org.lab.banco;

public abstract class Conta {
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = 1; // padrão para todas as contas
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void transferir(double valor, Conta contaDestino) {
		if (saldo >= valor) {
			sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente para transferência");
		}
	}

	public abstract void imprimirExtrato();
}
