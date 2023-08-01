package JavaTech;

import java.util.Scanner;

public class Ex02if {
	public static void main(String[] args) {
		// Cria um objeto para ler o número
		Scanner leia = new Scanner(System.in);

		// recebe a entrada do usuário
		System.out.println("Digite um número: ");
		int num = leia.nextInt();

		// Verifica se o número é par ou ímpar e positibo ou negativo
		if (num % 2 == 0) {
			if (num >= 0) {
				System.out.println(num + " é positivo e par");
			} else {
				System.out.println(num + " é negativo e par");
			}
		} else {
			if (num >= 0) {
				System.out.println(num + " é positivo e ímpar");
			} else {
				System.out.println(num + " é negativo e ímpar");
			}
		}
	}
}
