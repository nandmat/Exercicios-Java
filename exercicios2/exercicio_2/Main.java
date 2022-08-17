/* 02)Criar um programa que leia pelo teclado duas notas n1 e n2 de um aluno, calcule a média e exiba na tela 
se o aluno foi APROVADO ou REPROVADO. OBS.: A média base para aprovação é 6 */

package exercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		
		int n1 = leitor.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		
		int n2 = leitor.nextInt();
		
		Aluno aluno1 = new Aluno();
		
		aluno1.calculaMedia(n1, n2);
		
		leitor.close();

	}

}
