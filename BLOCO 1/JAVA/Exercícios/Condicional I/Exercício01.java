package br.com.generation.ex.condicional;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		// 1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner insira = new Scanner(System.in);
		
		int A, B, C, maior;
		
		System.out.println("Insira o valor de A: ");
		A = insira.nextInt();
		System.out.println("Insira o valor de B: ");
		B = insira.nextInt();
		System.out.println("Insira o valor de C: ");
		C = insira.nextInt();
		
		if(A>B && A>C) {
			maior = A;
		}
		
		else if(B>A && B>C) {
			maior = B;
		}
		
		else {
			maior = C;
			
		}
		
		System.out.println("O maior valor �: " + maior);
		
		insira.close();

	}

}
