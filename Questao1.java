//1) Criar um programa que receba três nomes de pessoas e mostre-os na tela.

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nome: ");
		String nome1 = leitor.nextLine();
		
		System.out.println("Digite o segundo nome: ");
		String nome2 = leitor.nextLine();
		
		System.out.println("Digite o terceiro nome: ");
		String nome3 = leitor.nextLine();
		
		System.out.println("Os nomes são: " + nome1 +", " + nome2 + ", " + nome3);

		leitor.close();
	}

}
