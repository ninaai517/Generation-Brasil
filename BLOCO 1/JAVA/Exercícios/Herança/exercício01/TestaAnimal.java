package br.com.generation.exerc�cio01;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Pregui�a pregui = new Pregui�a();
		
		
		dog.setNome("Sim�o");
		dog.setIdade(1);
		dog.setSomAnimal("AuAu");
		dog.setAcao("correr");
		dog.escrever();
		
		horse.setNome("Flavio");
		horse.setIdade(3);
		horse.setSomAnimal("ihuhuhihihihihihi");
		horse.setAcao("cavalgar loucamente");
		horse.escrever();
		
		pregui.setNome("Lilian");
		pregui.setIdade(2);
		pregui.setSomAnimal("Criiiii");
		pregui.setAcao("escalar �rvores");
		pregui.escrever();
		
		
		
		
		
	}

}
