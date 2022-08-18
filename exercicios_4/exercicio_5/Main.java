package exercicio_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da turma: ");
		int tam_turma = leitor.nextInt();
		
		int qtd_alunos[] = new int[tam_turma];
		
		preencherVetor(qtd_alunos);
		
		calcularMediaGeral(qtd_alunos);
		
		System.out.printf("MÉDIA GERAL: %d", calcularMediaGeral(qtd_alunos));
		
		leitor.close();

	}
	
	static void preencherVetor(int vetor[]) {
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.printf("Digite a %dª nota\n", (i + 1));
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();

}
	
	static int calcularMediaGeral(int vetor[]) {
		int media_geral = 0;
		
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			
			soma = soma + vetor[i];
		}
		
		media_geral = soma / vetor.length;
		
		return media_geral;
	}

}
