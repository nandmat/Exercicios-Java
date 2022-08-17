/*05) Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, criar um programa a que receba 
um número pelo teclado, verifique e imprima na tela se este número existe no vetor.*/
package exercicio_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
		
		System.out.println("Digite um número: ");
		int n = leitor.nextInt();
		
		boolean tem = false;
		
		for(int i = 0; i < v.length; i++) {
			
			if(n == v[i]) {
				
				tem = true;
			}
		}
		
		if(tem == true) {
			System.out.printf("O valor %d existe dentro do vetor\n", n);
		} else {
			System.out.printf("O valor %d não existe dentro do vetor\n", n);
		}
				
		leitor.close();
	}

}
