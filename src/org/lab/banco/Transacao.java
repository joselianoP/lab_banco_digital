package org.lab.banco;

public class Transacao {
	private String tipo;
	private double valor;
	private String data;

	public Transacao(String tipo, double valor, String data) {
		this.tipo = tipo;
		this.valor = valor;
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Transacao{" + "tipo='" + tipo + '\'' + ", valor=" + valor + ", data='" + data + '\'' + '}';
	}
}
