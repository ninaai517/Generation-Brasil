package br.com.generation.exerc�cio03;

public class ProdutoEletr�nico {
	
	//Atributos: 
	 String tipoDeProduto;
	 String marca;
	 int Ano;
	 double pre�o;
	
	//M�todos: 
	
	public double getDescontoSobPre�o() {
		double getDescontoSobPre�o = pre�o - (pre�o * 0.15) ;
		return getDescontoSobPre�o;
		
		
	}
	

}
