//preenche um vetor de com 10 termos e verifica qual deles � �mpar ou par e imprime na tela o seus respectivos resultados.

package exercicio_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int v[] = new int[10];
		
		preencherVetor(v);
		imprimeImpar(v);
		imprimePar(v);
		
		
		
	}
	
	static void preencherVetor(int vetor[]) {
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digite o valor a ser preenchido no vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();

}
	
	static void imprimePar(int vetor[]) {
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] % 2 == 0) {
				
				int par = vetor[i];
				
				System.out.printf("%d � par, ", par);
			}
}
		
}
	
	static void imprimeImpar(int vetor[]) {
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] % 2 != 0) {
				
				int impar = vetor[i];
				
				System.out.printf("%d � �mpar, ", impar);
			}
}
		
}
	
}
