package br.com.generation.exercicios;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		// 1.Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
		//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 5 valores: ");
		
		double vetor [] = new double[5];
		double pontuacaoMax = 0;
		
		for(int i = 0; i<5; i++) {
			System.out.println("Insira o valor de uma nota: ");
			vetor [i] = leia.nextDouble();
			
			if(i==0) {
				pontuacaoMax = vetor [0];
			}
			if(pontuacaoMax < vetor[i]) {
				pontuacaoMax = vetor[i];
				
			}
			
			
			
		}
		
		System.out.println("Maior pontua��o �: " + pontuacaoMax);
		
		leia.close();
		

	}

}
