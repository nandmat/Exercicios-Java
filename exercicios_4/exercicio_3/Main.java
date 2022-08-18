/*03) Criar um Programa que mostre qual é o maior e o menor número inteiro digitado em uma sequência.
O programa deverá receber a quantidade de elementos a serem digitados, bem como entrar com esses elementos. 
Em seguida, deverá exibir o maior e o menor número!
Para isso deverá adotar os seguintes requisitos:
a) Criar uma sub-rotina que recebe, como parâmetro, o vetor de inteiros, e preencher cada posição utilizando 
entrada padrão (Scanner);
b) Criar uma sub-rotina chamada printMaiorNumero(), que recebe o vetor como parâmetro, verifique e 
imprima o maior número;
c) Criar uma sub-rotina chamada printMaiorNumero(), que recebe o vetor como parâmetro, verifique e 
imprima o menor número;
d) O método  principal (main) deverá:
 receber via teclado, a quantidade de elementos a serem preenchidos e criar um vetor de inteiros;
 Em seguida, deverá efetuar o preenchimento deste vetor;
 Com o uso das sub-rotinas (métodos) criadas, imprimir o maior e menor número digitado.*/

package exercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de termos desejados: ");
		int n = leitor.nextInt();
		
		int v[] = new int[n];
		
		preencherVetor(v);
		
		printMaiorNumero(v);
		printMenorNumero(v);
		
		leitor.close();

	}
	
	static void preencherVetor(int vetor[]) {
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digite o valor a ser preenchido no vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
	}
	
	static void printMaiorNumero(int vetor[]) {
		
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] > maior) {
				
				maior = vetor[i];
				
			}
		}
		
		System.out.println("Maior valor: " + maior);
		
		
	}
	
	static void printMenorNumero(int vetor[]) {
		
		int menor = Integer.MAX_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] < menor) {
				
				menor = vetor[i];
				
			}
		}
		
		System.out.println("Menor valor: " + menor);
		
		
	}

}
