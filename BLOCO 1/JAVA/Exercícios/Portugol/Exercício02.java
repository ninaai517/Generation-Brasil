package br.com.generationExPortugol;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		//2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias.
		//Mostre-a expressa em anos, meses e dias. 
		
		Scanner leia = new Scanner(System.in);
		
		int idadeTotal, idadeMeses, idadeAnos, idadeDias;
		
		System.out.println("Digite sua idade total em dias: ");
		idadeTotal = leia.nextInt();
		
		idadeAnos = idadeTotal / 365;
		idadeTotal = idadeTotal % 365;
		
		idadeMeses = idadeTotal / 30;
		idadeTotal = idadeTotal % 30;
		
		idadeDias = idadeTotal;
		
		System.out.println("Minha idade �: " + idadeAnos + " anos, " + idadeMeses + " meses e " + idadeDias + " dias.");
		
		leia.close();
				
			
				
	}

}
