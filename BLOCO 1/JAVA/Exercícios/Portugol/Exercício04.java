package br.com.generationExPortugol;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
		//4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C).
		//Calcule a seguinte express�o: 
		// D = (R + S) / 2 , onde: 
		//R = (A + B)� e 
		//S = (B + C)�
		
		Scanner leia = new Scanner(System.in);
		
		double D, R, S, A, B, C;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextDouble();
		
		R = (Math.pow(A + B, 2)) / 2;
		S = (Math.pow(B + C, 2)) / 2;
		D = (R + S) / 2;
		
		System.out.println("D = " + D);
		
		leia.close();
		
	}

}
