//07)	Fa�a um programa que receba um n�mero inteiro entre 1 e 12 e informe o m�s correspondente, por exemplo, se a entrada for: 
// 1, exiba Janeiro; 2, exiba Fevereiro;... OBS.: Utilizar o comando switch case

package exercicio_7;

import java.util.Scanner;

import exercicio_6.Data;

public class Main {

	public static void main(String[] args) {
		Data mes = new Data();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero entre 1 e 12: ");
		mes.imprimeMes(leitor.nextInt());
		
		leitor.close();

	}

}
