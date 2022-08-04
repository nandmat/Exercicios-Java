import java.util.Scanner;

// Criar um programa que verifique e retorne o maior numero entre tres numeros

public class Exemplo02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a, b, c, res;
		
		System.out.print("Digite o valor de A: ");
		a = leitor.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = leitor.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = leitor.nextInt();
		
		res = maior(a, b, c);
		
		System.out.printf("O maior valor é: %d", res);
		
		leitor.close();

	}
	
	public static int maior(int parametro1, int parametro2, int parametro3) {
		
		int resultado;
		
		if (parametro1 > parametro2 && parametro1 > parametro3) {
			resultado = parametro1;
		} else if (parametro2 > parametro3) {
			resultado = parametro2;
		} else {
			resultado = parametro3;
		}
		
		
		return resultado;
	}

}
