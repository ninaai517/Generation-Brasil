package br.com.generation.exerc�cio06;

public class ContaBancaria {
	String login;
	String senha;
	double saldo;
	double valorFatura;
	double parcela;
	double saldoFinal;
	
	public void pagarConta(double saldo) {
		saldoFinal = saldo - valorFatura;	
		
	}
	public void  parcelarFaturaint (int numParcela) {
		parcela = valorFatura / numParcela;
		
	}

}
