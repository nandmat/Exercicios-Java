//7) Criar um programa que leia um valor em Real e a cotação do dólar, e converta esse valor em dólares.

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais: ");
		String text1 = leitor.nextLine();
		
		float real = Float.parseFloat(text1);
		
		System.out.println("Qual a cotação do dólar? ");
		String text2 = leitor.nextLine();
		
		float dolar = Float.parseFloat(text2);
		
		float cotacao = real / dolar;
		
		System.out.println("Você tem: $" + cotacao);

		leitor.close();
	}

}
