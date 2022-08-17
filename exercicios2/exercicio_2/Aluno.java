package exercicio_2;

public class Aluno {
	
	public void imprimeCategoria(int a) {
		if(a >= 1 && a <= 10) {
			System.out.printf("Idade: %d // Categoria: infantil", a);
		} else if(a >= 11 && a <= 17) {
			System.out.printf("Idade: %d // Categoria: Juvenil", a);
		}else if(a >= 18) {
			System.out.printf("Idade: %d // Categoria: Sênior", a);
		}
	}
	
	void calculaMedia(int a, int b) {
		int media = a + b;
		
		if(media >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
