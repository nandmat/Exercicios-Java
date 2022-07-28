//9) Criar um programa que receba idade de uma pessoa e imprima o seu ano de nascimento.

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = leitor.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int ano = leitor.nextInt();
		
		int result = ano - idade;
		
		System.out.println("Você nasceu em: " + result);
		
		leitor.close();
	}

}
