package JavaTech;

import java.util.Scanner;

public class Ex01if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Objeto Scanner para puxar os valores de entrada do usuário
		Scanner entrada = new Scanner(System.in);
		int A, B, C, soma;
		// inserir as entradas de A, B e C

		System.out.print("Digite o valor de A: ");
		A = entrada.nextInt();

		System.out.print("Digite o valor de B: ");
		B = entrada.nextInt();

		System.out.print("Digite o valor de C: ");
		C = entrada.nextInt();

		// Calcular a soma de A + B
		soma = A + B;

		if (soma > C) {
			System.out.println("\n" + A + " + " + B + " = " + soma + " > " + C);
			System.out.print("\nA Soma de A + B é Maior do que C");
		} else if (soma < C) {
			System.out.println("\n" + A + " + " + B + " = " + soma + " < " + C);
			System.out.print("\nA Soma de A + B é menor do que C");
		} else {
			{
				System.out.println("\n" + A + " + " + B + " = " + soma + " = " + C);
				System.out.print("\nA Soma de A + B é igual a C");
			}
		}
	}

}

