/*Dado um vetor V = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0}, criar um programa que efetua 
a média dos valores e imprima o resultado.*/
package exercicio_3;

public class Main {

	public static void main(String[] args) {

		double V[] = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
		
		double soma = 0;
		
		double media;
		
		for(int i = 0; i < V.length; i++) {
			soma = soma + V[i];
		}
		
		media = soma / V.length;
		
		System.out.printf("MÉDIA: %2f", media);
	}

}
