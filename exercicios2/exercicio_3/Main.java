/* 03)	As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem compradas pelo menos 12. 
 Crie um programa que receba a quantidade de ma��s compradas, calcule e escreva o custo total da compra.  */

package exercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de ma��s que quer: ");
		double qtdMacas = leitor.nextDouble();
		
		Compra macas = new Compra();
		
		macas.compraMacas(qtdMacas);
		
		leitor.close();

	}
	

}
