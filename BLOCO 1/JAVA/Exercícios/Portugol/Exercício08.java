package br.com.generationExPortugol;

import java.util.Scanner;

public class Exerc�cio08 {

	public static void main(String[] args) {
//8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos 
//(aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.

		Scanner digite = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor;
		double percDistribuidor = 0.28, imposto = 0.45;
		
		System.out.println("Custo do autom�vel: R$");
		custoFabrica = digite.nextDouble();
		
		custoConsumidor = custoFabrica + (custoFabrica * percDistribuidor) + (custoFabrica * imposto);
		
		System.out.println("Custo final do autom�vel: R$ " + custoConsumidor);
		
		digite.close();
	}

}
