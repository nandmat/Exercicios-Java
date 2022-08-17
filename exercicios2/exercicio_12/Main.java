/*12) Criar um programa que receba pelo teclado 10 números inteiros. Apresentar na tela o MAIOR e o MENOR 
número lido. OBS.: Não use vetor.*/

package exercicio_12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int menor = 0, maior = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um valor: ");
			int n = leitor.nextInt();
			
			if(i == 1) {
				maior = n;
				menor = n;
			}
			
			if (n > maior) {
				maior = n;
			}
			
			if(n < menor) {
				menor = n;
			}
		}
		
		System.out.printf("MAIOR: %s\n", maior);
		System.out.printf("MENOR: %s", menor);
		
		leitor.close();
	}

}
