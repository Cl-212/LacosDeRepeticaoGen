package JavaTech;

import java.util.Scanner;

public class ex03While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// variaves inteiras para contar as idades
		int ida1 = 0, ida2 = 0, idade;
		
		//Aviso para o usuario
		System.out.println("OBS: caso digite uma idade negativa o programa irá encerrar\n");
		
		//inicio do laço While
		
		while(true)/*condição eternamente verdadeira até o 'break'*/{
			
			//Solicita as idades ao usuario 
			System.out.println("Insira a idade das pessoas:");
			idade = leia.nextInt();
			
			//verifica caso a idade seja verdadeira
			if(idade < 0) {
				break;
			}
			//verifica idade menor que 21
			if(idade < 21) {
				ida1++;
			}
			//verifica idade maior que 50
			if(idade > 50) {
				ida2++;
			}
		}
		//Mostrando as idades ao usuario
		System.out.printf("\ntotal de pessoas menor que 21: %d", ida1);
		System.out.printf("\ntotal de pessoas maiores que 50: %d", ida2);
	}

}
