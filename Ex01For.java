package JavaTech; //CLÉSIO OLIMPIO SANTOS

import java.util.Scanner;

public class Ex01For {

	public static void main(String[] args) {
		//Objeto Scanner para ler dados do teclado
		Scanner leia = new Scanner(System.in);

		// variaves inteiras para contar os numeros
		int i, pNum, uNum;

		//Puxando numeros do usuario
		System.out.println("\nPrimeiro número: ");
		pNum = leia.nextInt();
		//Puxando numeros do usuario
		System.out.println("\nSegundo número: ");
		uNum = leia.nextInt();

		if (pNum >= uNum)/*condição de intervalo*/ {
			System.out.println("\nintervalo invalido!");//
		} else {
			System.out.printf("\nNo intervalo entre %d e %d:\n", pNum, uNum);
			for (i = pNum + 1; i <= uNum; i++)/*Iniciando laço for*/ {
				if (i % 3 == 0 && i % 5 == 0) /*Verificando multiplos*/ {
					System.out.printf("\n%d é múltiplo de 3 e 5!", i);//mostrando os multiplos
				}
			}

		}

	}

}
