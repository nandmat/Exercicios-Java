package exercicio_3;

public class Compra {
	
	void compraMacas(double a) {
		double valor;
		
		if(a < 12) {
			valor = 1.30;
			double valorFinal = valor * a;
			System.out.println("Valor da compra: " + valorFinal);
		} else if(a >= 12) {
			valor = 1.00;
			double valorFinal = valor * a;
			System.out.println("Valor da compra: " + valorFinal);
		}
	}

}
