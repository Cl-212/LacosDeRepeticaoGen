package JavaTech;

import java.util.Scanner;

public class ExtraEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float  nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nNota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nNota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("\nNota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("\nMedia final: " + media);
		System.out.printf("\nMedia final: %.1f", media);
		
	}
}
