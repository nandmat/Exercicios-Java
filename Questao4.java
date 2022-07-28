// 4) Criar um programa que leia um número real imprima o seu dobro.

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.println("Digite um número: ");
		 String text = leitor.next();
		 
		 int numero = Integer.parseInt(text);
		 
		 int resultado = numero * 2;
		 
		 System.out.println("O resultado é: " + resultado);

		 leitor.close();
	}

}
