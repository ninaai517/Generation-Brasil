package br.com.generation.exerc�cio05;

public class Patinete {
	
	String cor;
	String categoria;
	double preco;
	double frete;
	
	public double getCusto() {
		double getCusto = preco + frete ;
		return getCusto;
	}

}
