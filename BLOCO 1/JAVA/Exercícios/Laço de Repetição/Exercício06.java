package br.com.generation.lista;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
		//6-Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma=0, i=0;
		double media = 0.0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(num%3==0 && num!=0) {
				soma = soma + num;
				i++;
				media = soma / i;
			}

		}while(num!=0);
		
		System.out.printf("A m�dia �: " + media);
		
		leia.close();
	}

}
