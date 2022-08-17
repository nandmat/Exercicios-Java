/*07) Criar um programa preencha um vetor de inteiros de 10 posições, via teclado. Após o preenchimento do 
vetor, o programa deverá verificar quais são os elementos ímpares e gerar um novo vetor com esses elementos. Por 
fim, o programa deverá exibir na tela os dois vetores.*/
package exercicio_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int v[] = new int[10];
		
		for(int i = 0; i < v.length; i++) {
			System.out.printf("Digite o %dº número: ",(i + 1));
			v[i] = leitor.nextInt();
			
		}
		
		int numero_impares = 0;
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] % 2 != 0) {
				numero_impares++;
			}
			
		}
		
		int impares[] = new int[numero_impares];
		int contador = 0;
		for(int i = 0; i < v.length; i++) {
			
			if(v[i] % 2 != 0) {
				impares[contador] = v[i];
				contador++;
			}
		}
		
		
		for(int i = 0; i < v.length; i++) {
			System.out.printf("%d - ", v[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < impares.length; i++) {
			System.out.printf("%d - ", impares[i]);
		}
		leitor.close();

	}

}
