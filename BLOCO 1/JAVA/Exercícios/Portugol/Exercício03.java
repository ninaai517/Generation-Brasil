package br.com.generationExPortugol;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos.
		//Mostre-o expresso em horas, minutos e segundos. 
		
		Scanner entrada = new Scanner(System.in);
				
		int eventoTotal, hr, min, seg;
		
		System.out.println("Digite a dura��o total do evento em segundos: ");
		eventoTotal = entrada.nextInt();
		entrada.close();
		
		hr = eventoTotal / 3600;
		eventoTotal = eventoTotal % 3600;
		
		min = eventoTotal / 60;
		eventoTotal = eventoTotal% 60;
		
		seg = eventoTotal;
		
		System.out.print("Dura��o do evento: " + hr + " hora(s), ");
		System.out.print(min + " minuto(s) e ");
		System.out.print(seg + " segundo(s)");
	}

}
