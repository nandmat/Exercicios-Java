/*Dado um vetor V = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10} criar um programa que efetua a soma dos valores e 
imprima o resultado.*/

package exercicio_2;

public class Main {

	public static void main(String[] args) {
		
		int V[] = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10};
		
		int soma = 0;
		
		for(int i = 0; i < V.length; i++) {
			soma = soma + V[i];
		}
		
		System.out.printf("SOMA: %d", soma);
	}

}
