//10) Criar um programa que receba dois valores A e B, e efetue a troca dos valores de forma que a variável A passe a 
//possuir o valor da variável B e que a variável B passe a possuir o valor da variável A. Por fim, apresentar os valores 
//trocado.

import java.util.Scanner;


public class Questao10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		int a = scanner.nextInt();
		System.out.println("Digite o valor de b: ");
		int b = scanner.nextInt();
		
		if(a != 0 && b !=0) {
			a = b;
			b = a;
			
			System.out.println(" 'a' agora vale: " + a +"\n b agora vale: " + b);
		}
		
		scanner.close();
	}
}	
