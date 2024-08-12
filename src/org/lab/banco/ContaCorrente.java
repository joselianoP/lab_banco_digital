package org.lab.banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Número: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
}
