/*01) Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima estes valores na tela.*/

package exercicio_1;

public class Main {

	public static void main(String[] args) {
		
		int V[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < V.length; i++) {
			System.out.printf("Termo: %d\n", V[i]);
		}
	}

}
