/* 09)	Criar um programa que leia os valores A e B, compare se a soma de A e B é divisível por 2 e imprima a resposta na tela.*/

package exercicio_9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = leitor.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = leitor.nextInt();
		
		somaCompara(a, b);
		
		leitor.close();

	}
	
	static void somaCompara(int a, int b) {
		int res = a + b;
		
		if(res % 2 == 0) {
			System.out.printf("O resultado da soma %d é divisível por dois.", res);
		}else {
			System.out.printf("O resultado da soma %d não é divisível por 2.", res);
		}
	}

}
