//01)	Criar um programa que leia o sal�rio de um funcion�rio. Apresente na tela o sal�rio do funcion�rio com reajuste de 15%.

package exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Salario salario1 = new Salario();
		
		System.out.println("Digite seu sal�rio: ");
		
		salario1.reajustaSalario(leitor.nextDouble());
		
		leitor.close();

	}

}
