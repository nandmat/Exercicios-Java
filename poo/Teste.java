package poo;

public class Teste {

	public static void main(String[] args) {
		
		Data dtNasc = new Data();
		
		dtNasc.preeencherData(18, 12, 1997);
		
		//dtNasc.imprimirData();
		
		Pessoa matheus = new Pessoa();
		
		matheus.preencherDados("Nanderson Matheus Reis", "555666777888-32");
		matheus.dataNascimento = dtNasc;
		
		matheus.imprimir();
	}

}
