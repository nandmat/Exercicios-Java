//Criar um algoritmo que receba a idade de um nadador e informe a sua categoria:
//infantil (at� 10 anos), juvenil (at� 17 anos) ou s�nior (acima de 17 anos).

package exercicio_4;

import java.util.Scanner;

import exercicio_2.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Aluno nadador = new Aluno();
		
		System.out.println("Digite sua idade: ");
		
		nadador.imprimeCategoria(leitor.nextInt());
		
		leitor.close();

	}

}
