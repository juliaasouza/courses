package exercicioum;

public class Emprestimo {
	
	public static double pegarTaxa(int parcelas) {
		if(parcelas == 1) {
			return 0.2;
		}
		
		else if(parcelas == 2) {
			return 0.3;
		}
		
		else if(parcelas == 3) {
			return 0.4;
		}
		
		else {
			return 0.6;
		}
	}
	
	public static void calcular(double valor, int parcelas) {
		double valorFinal = valor + (valor * pegarTaxa(parcelas));
		
		System.out.println("O valor final do emprestimo sera de " + valorFinal + " reais.");
	}

}
