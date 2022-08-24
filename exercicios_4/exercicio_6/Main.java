//6) Criar um programa que mostre um relatório de quantidades de vogais que aparecem em uma sequência:
package exercicio_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da seguência de vogais: ");
		int x = in.nextInt();	
		
		String vetor[] = gerarSequencia(x);
		
		imprimirRelatorio(vetor);
		in.close();
	}
	
public static String[] gerarSequencia(int x) {
	Scanner in = new Scanner(System.in);
	
		String vetor[] = new String[x];
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digite uma vogal: ");
			vetor[i] = in.nextLine();
					
		}

		in.close();
		
		return vetor;
		
	}
	
	public static void imprimirRelatorio(String vetor[]) {
		
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			switch(vetor[i]) {
			case "a": contA++; break;
			
			case "e": contE++; break;
			
			case "i": contI++; break;
			
			case "o": contO++; break;
			
			case "u": contU++; break;
			}
		}
		
		System.out.println("CONTAGEM DE VOGAIS");
		System.out.printf("Letra A: %d\n", contA);
		System.out.printf("Letra E: %d\n", contE);
		System.out.printf("Letra I: %d\n", contI);
		System.out.printf("Letra O: %d\n", contO);
		System.out.printf("Letra U: %d\n", contU);
		

	}

}
