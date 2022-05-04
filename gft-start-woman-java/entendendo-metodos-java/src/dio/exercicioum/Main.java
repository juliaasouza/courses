package dio.exercicioum;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Testes da calculadora:");
		Calculadora.soma(1, 2);
		Calculadora.subtracao(5, 1);
		Calculadora.multiplicacao(2, 5);
		Calculadora.divisao(4, 3);
		
		System.out.println("Testes do horario:");
		Horario.diaTardeNoite(9);
		Horario.diaTardeNoite(17);
		Horario.diaTardeNoite(20);
		
		System.out.println("Testes do emprestimo:");
		Emprestimo.calcular(10, 1);
		Emprestimo.calcular(20, 2);
		Emprestimo.calcular(20, 3);
	}

}
