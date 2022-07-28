//2) Criar um programa que calcule a média de 2 notas e mostrar essa média na tela.

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		String num1 = leitor.next();
		
		float num1Convetido = Float.parseFloat(num1);
		
		System.out.println("Digite o segundo número: ");
		String num2 = leitor.next();
		
		float num2Convertido = Float.parseFloat(num2);
		
		float resultado = (num1Convetido + num2Convertido) / 2;
		
		System.out.println("A média é: " + resultado);
		
		leitor.close();
	}

}
