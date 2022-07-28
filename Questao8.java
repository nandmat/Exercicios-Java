//8) Criar um programa que receba o ano de nascimento de uma pessoa e imprima a sua idade atual e imprima também a sua idade em 2050.
import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade atual: ");
		int idade = scanner.nextInt();
		
		
		int ano = 2050 - 2022;
		
		int resultado = idade + ano;
		
		System.out.println("Sua idade é: " + idade);
		System.out.println("em 2050 sua idade será: " + resultado);
		
		scanner.close();
	}

}
