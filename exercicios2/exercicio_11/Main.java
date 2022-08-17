/* 11) Criar um programa que receba pelo teclado um número positivo inteiro N. Apresentar na tela a soma dos N 
primeiros números, por exemplo: se N = 5, então SOMA = 1 + 2 + 3 + 4 + 5*/

package exercicio_11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n, soma = 0;
		
		System.out.println("Digite o valor de N: ");
		n = leitor.nextInt();
		
		for(int i = 0; i <= n; i++) {
			soma = soma + i;
		}
		
		System.out.printf("Soma: %d", soma);
		leitor.close();

	}

}
