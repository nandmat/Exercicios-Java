/*04)       Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima este conjunto acompanhado 
do seu elemento sim�trico em rela��o a sua posi��o no conjunto, ou seja, a impress�o ser�: 1 - 10, 2 - 9, 3 - 8, 4 - 7, 5 
- 6, 6 - 5, 7 - 4, 8 - 3, 9 - 2, 10 - 1.*/
package exercicio_4;

public class Main {

	public static void main(String[] args) {
		int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < v.length; i++) {
			
			int posicao = (v.length - 1) - i;
			
			System.out.printf("%s - %s\n", v[i], v[posicao]);
		}

	}

}
