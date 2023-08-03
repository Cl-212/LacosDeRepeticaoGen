package JavaTech;

import java.util.Scanner;

public class ex03DoWhile {
	
	public static void main(String[] args) {
		
		//Objeto Scanner para ler dados do teclado
		Scanner leia = new Scanner(System.in);
		
		//Declarando variaveis
		int num, soma = 0;
		
		//Aviso para o usuario
		System.out.println("OBS: caso digite o numero '0' o programa será encerrado!\n");
		
		//Inicio do laço
		do {
			//Puxando numeros do usuario
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			
			//condição para verificar se é positivo
			if (num > 0) {
				//caso seja positivo é somado a variavel
				soma += num;
			}
		}while(num != 0);// laço se repete enquato o numero soma for diferente de zero
		
		System.out.printf("\nA soma dos números positivos é: %d", soma);
	}

}
