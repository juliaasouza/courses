package exerciciotres;

public class Retorno {
	
	public static double calculaArea(double lado) {
		return lado * lado;
	}
	
	public static double calculaArea(double lado1, double lado2) {
		return lado1 * lado2;
	}
	
	public static double calculaArea(double baseMenor, double baseMaior, double altura) {
		return ((baseMenor + baseMaior) * altura) / 2;
	}
}
