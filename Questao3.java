//3) Criar um programa que leia o nome de uma pessoa, a sua idade e o seu salário, e mostrar essas informações.

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite sua idade: ");
		String idade = leitor.nextLine();
		
		int idadeConvertida = Integer.parseInt(idade);
		
		System.out.println("Digite seu salário: ");
		String salario = leitor.next();
		
		float salarioConvertido = Float.parseFloat(salario);
		
		System.out.println("Nome: " + nome + " Idade: " + idadeConvertida + " Salário: " + salarioConvertido);

		leitor.close();
	}

}
