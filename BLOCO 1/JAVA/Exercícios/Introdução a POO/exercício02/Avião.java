package br.com.generation.exerc�cio02;

public class Avi�o {
	//Atributos do avi�o:
	
	private int passeiro;
	private double custo;
	
	
	public Avi�o (int numeroPassageiro, double valorPassagem) {
		passeiro = numeroPassageiro;
		custo = valorPassagem;
		
	}
	
	public double getCustoViagem () {
		double getCustoViagem = passeiro * custo;
		return getCustoViagem;
			
	}
	
	
		
		
		
	
	

}
