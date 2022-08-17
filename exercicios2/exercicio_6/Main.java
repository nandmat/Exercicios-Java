//06)	Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente, por exemplo, se a entrada for: 
// 1, mostre Domingo; 2, exiba Segunda;... OBS.: Utilizar o comando switch case

package exercicio_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Data dia = new Data();
		
		System.out.println("Digite um número entre 1 e 7: ");
		dia.imprimeDia(leitor.nextInt());
		
		leitor.close();

	}

}
