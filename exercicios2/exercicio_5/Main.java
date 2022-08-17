// 05)	Criar um programa que leia pelo teclado um valor inteiro e diga se é par ou ímpar.

package exercicio_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operacao operacao1 = new Operacao();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		operacao1.imprimeParOuImpar(leitor.nextInt());
		
		leitor.close();

	}

}
