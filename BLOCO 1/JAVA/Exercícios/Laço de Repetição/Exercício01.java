package br.com.generation.lista;

public class Exerc�cio01 {

	public static void main(String[] args) throws InterruptedException {
		// 1-Informar todos os n�meros de 1000 a 1999 que 
		//quando divididos por 11 obtemos resto = 5. (FOR).
		
		

		
		for(int i = 1000; i<=1999; i++ ) {
			if(i%11==5) {
				System.out.println("N�meros diviseis por 11 com resto 5: " + i );
				Thread.sleep(500);
					
			}
		
				
			
			
			
		}

	}

}
