package br.com.generation.exerc�cio03;

public class Eletr�nico {

	public static void main(String[] args) {

		ProdutoEletr�nico compra01 = new ProdutoEletr�nico();
		
		compra01.tipoDeProduto = "Celular";
		compra01.marca = "Motorola";
		compra01.Ano = 2017;
		compra01.pre�o = 700.00;
		
		System.out.println("Produto selecionado: " + compra01.tipoDeProduto);
		System.out.println("Marca: " + compra01.marca);
		System.out.println("Ano de Lan�amento: " + compra01.Ano);
		System.out.println("Custo: R$ " + compra01.pre�o);
		System.out.println("Valor da compra com desconto de 15% : " + compra01.getDescontoSobPre�o());
		
	}

}
