/*
 * 01) Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, criar um programa a que receba 
um número pelo teclado, verifique e imprima na tela se este número existe no vetor.

Para isso, deverá considerar os seguintes requisitos:
 Criar uma sub-rotina que receba dois parâmetros (vetor, e o número a ser pesquisado);
 A sub-rotina deverá verificar a existência do número a ser pesquisado e imprimir uma mensagem de sucesso 
ou insucesso;
 Usar a sub-rotina criada no programa principal.*/

package exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
		
		System.out.println("Digite o número a ser veriifcado: ");
		int termo = leitor.nextInt();
		
		verificaNumero(v, termo);
		
		leitor.close();
	}
	
	private static void verificaNumero(int vetor[], int termo) {
		boolean encontrado = false;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(termo == vetor[i]) {
				
				encontrado = true;
			}
		}
		
		if(encontrado == true) {
			System.out.printf("O TERMO %d EXISTE NO VETOR", termo);
		}else {
			System.out.println("Não existe no vetor");
		}
	}

}
