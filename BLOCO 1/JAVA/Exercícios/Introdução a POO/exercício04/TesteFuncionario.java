package br.com.generation.exerc�cio04;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nome01 = new Funcionario();
		Scanner entrada = new Scanner(System.in);
		
		
		nome01.nomeCompleto = "Carolina Moreira";
		nome01.funcao = "Vendedora";
		nome01.metaVendas = 300.00;
		nome01.salario = 2500.00;
		nome01.numVendas = 10;
		
		System.out.println("Nome do vendedor: " + nome01.nomeCompleto);
		System.out.println("Meta de vendas: R$ " +nome01.metaVendas);
		System.out.println("Fun��o: " +nome01.funcao);
		System.out.println("Sal�rio atual: R$ " +nome01.salario);
		System.out.println("N�mero de vendas: " +nome01.numVendas);
		System.out.println("Parabens! Voc� atingiu o n�mero de vendas. Sal�rio R$ " + nome01.getAumento());
		
				
	}

}
