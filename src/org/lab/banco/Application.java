package org.lab.banco;

public class Application {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco Digital");

		Cliente cliente1 = new Cliente("Maria");
		Cliente cliente2 = new Cliente("João");

		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente2);

		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);

		cc.depositar(1000);
		cc.transferir(200, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
