package br.com.generation.lista;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
		// 5-Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0, i = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(num!=0) {
				i++;
				soma = soma + num;	
			}
			
			
		}while(num!=0);
		
		System.out.println("Total de n�meros digitados: " + soma);
	}
	

}
