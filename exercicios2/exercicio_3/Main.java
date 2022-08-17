/* 03)	As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. 
 Crie um programa que receba a quantidade de maçãs compradas, calcule e escreva o custo total da compra.  */

package exercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de maçãs que quer: ");
		double qtdMacas = leitor.nextDouble();
		
		Compra macas = new Compra();
		
		macas.compraMacas(qtdMacas);
		
		leitor.close();

	}
	

}
