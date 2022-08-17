//10)	Criar um programa que leia os valores A, B, N, compare se a soma de A e B é divisível por N e imprima a resposta na tela.

package exercicio_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = leitor.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = leitor.nextInt();
		
		System.out.println("Digite o valor de N: ");
		int n = leitor.nextInt();
		
		somaCompara(a, b, n);
		
		leitor.close();

	}
	
	static void somaCompara(int a, int b, int n) {
		int res = a + b;
		
		if(res % n == 0) {
			System.out.printf("O resultado da soma %d é divisível por %d.", res, n);
		}else {
			System.out.printf("O resultado da soma %d não é divisível por %d.", res, n);
		}
	}

}
