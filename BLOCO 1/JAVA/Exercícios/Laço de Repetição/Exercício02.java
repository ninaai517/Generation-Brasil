package br.com.generation.lista;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) throws InterruptedException {
		// 2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		
		int par=0, impar=0, num;
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(i%2==0) {
				par++;
			}
			else {
				impar++;
			}	
			
			
		}
		System.out.println("Total de pares: " + par);
		System.out.println("Total de �mpares: " + impar);
		leia.close();

	}

}
