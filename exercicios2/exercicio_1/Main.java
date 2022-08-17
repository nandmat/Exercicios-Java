//01)	Criar um programa que leia o salário de um funcionário. Apresente na tela o salário do funcionário com reajuste de 15%.

package exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Salario salario1 = new Salario();
		
		System.out.println("Digite seu salário: ");
		
		salario1.reajustaSalario(leitor.nextDouble());
		
		leitor.close();

	}

}
