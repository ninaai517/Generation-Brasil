package br.com.generation.ex.condicional;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
		//4-Fa�a um programa em que permita a entrada de um n�mero qualquer 
		//e exiba se este n�mero � par ou �mpar. 
		//�	Se for par exiba tamb�m a raiz quadrada do mesmo; 
		//�	Se for �mpar exiba o n�mero elevado ao quadrado;
		
		Scanner entre = new Scanner(System.in);
		
		int n1, par, impar; 
		
		System.out.println("Digite um n�mero: ");
		n1 = entre.nextInt();
		
		if(n1%2==0) {
			par = (int) Math.sqrt(n1);
			System.out.println("O n�mero � par. E sua raiz quadrada �: " + par);
		}
		else {
			impar = (int) Math.pow(n1, 2);
			System.out.println("O n�mero � �mpar. E o seu quadrado �: " + impar);
		}
		entre.close();
		
	}

}
