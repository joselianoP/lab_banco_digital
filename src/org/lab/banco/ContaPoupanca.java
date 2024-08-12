package org.lab.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Número: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
}
