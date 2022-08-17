package exercicio_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int impar = 0;
		
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.printf("Digite um valor: ");
			int n = leitor.nextInt();
			
			if (n % 2 != 0) {
				impar++;
			}
		}
		
		System.out.printf("Quantidade de números pares: %s", impar);
		
		leitor.close();
	}

}
