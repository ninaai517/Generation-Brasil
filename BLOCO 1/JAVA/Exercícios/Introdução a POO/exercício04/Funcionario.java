package br.com.generation.exerc�cio04;

public class Funcionario {
	
	//atribui��es:
	
	String nomeCompleto;
	String funcao;
	double salario;
	double metaVendas;
	int numVendas;
	
	
	//criando a�oes: m�todos
	
	public double getAumento() {
		
			double getAumento = salario + (salario * 0.5);	
			return getAumento;	
		}
		


}
