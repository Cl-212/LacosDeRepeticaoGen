package JavaTech;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// objeto para ler o numero
		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha um produto:");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Bauru");
		System.out.println("5 - Refrigerante");
		System.out.println("6 - Suco de laranja");
		// recebe a entrada do usuario
		System.out.println("\nDigite o codigo do produto de 1 a 6: ");
		int codigo = leia.nextInt();
		float preco = (float) 0.0;
		String produto = "";
		
		//seleciona produto
		
		switch (codigo) {
		case 1:
			produto = "Cachorro quente";
			preco = (float) 10.00;
			break;
		case 2:
			produto = "x-salada";
			preco = (float) 15.00;
			break;
		case 3:
			produto = "X-Bacon";
			preco = (float) 18.00;
			break;
		case 4:
			produto = "Bauru";
			preco = (float) 12.00;
			break;
		case 5:
			produto = "refrigerante";
			preco = (float) 8.00;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = (float) 13.00;
			break;
		default:
			System.out.println("codigo do produto não existe!");
		}

		System.out.println("Informe a quantidade comprada: ");
		int quantidade = leia.nextInt();

		//condição para invalidar a compra 
		if (quantidade <= 0) {
			System.out.println("entrada invalida. Compre um lanche!");
			leia.close();
		}

        float valorTotal = preco * quantidade;

        System.out.println("Produto: "+produto);
        System.out.println("Valor total da conta: R$ " +valorTotal);
	}

}
