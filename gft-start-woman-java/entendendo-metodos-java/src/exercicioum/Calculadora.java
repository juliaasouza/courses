package exercicioum;

// Eu pessoalmente teria feito com return em vez de print no final das funcoes,
// mas eu preferi refazer seguindo o exemplo do professor

public class Calculadora {
	
	public static void soma(double a, double b) {
		double resultado = a + b;
		
		System.out.println("A soma de " + a + " e " + b + " e " + resultado);
	}
	
	public static void subtracao(double a, double b) {
		double resultado = a - b;
		
		System.out.println("A subtracao de " + a + " e " + b + " e " + resultado);
	}
	
	public static void multiplicacao(double a, double b) {
		double resultado = a * b;
		
		System.out.println("A multiplicacao de " + a + " e " + b + " e " + resultado);
	}
	
	public static void divisao(double a, double b) {
		double resultado = a / b;
		
		System.out.println("A divisao de " + a + " e " + b + " e " + resultado);
	}

}
