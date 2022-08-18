/*02) Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, criar um programa que leia um 
número e informe na tela quantas vezes este número foi encontrado no vetor.
Para isso, deverá considerar os seguintes requisitos:
 Criar uma sub-rotina que receba dois parâmetros (vetor, e o número a ser pesquisado);
 A sub-rotina deverá verificar quantas vezes o número a ser pesquisado aparece no vetor, e imprimir uma 
mensagem informando a quantidade;
 Usar a sub-rotina criada no programa principal.*/


package exercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		
		System.out.println("Digite o número: ");
		int n = leitor.nextInt();
		
		contaNumero(v, n);
		
		leitor.close();
		

	}
	
	private static void contaNumero(int vetor[], int termo) {
		
		int contador = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(termo == vetor[i]) {
				contador++;
			}
		}
		
		System.out.printf("O termo %d foi encontrado %d vez(vezes) no vetor.", termo, contador++);
	}

}
