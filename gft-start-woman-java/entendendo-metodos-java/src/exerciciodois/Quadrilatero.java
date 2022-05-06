package exerciciodois;

public class Quadrilatero {
	
	public static void calculaArea(double lado) {
		System.out.println("A area do quadrado e " + lado * lado);
	}
	
	public static void calculaArea(double lado1, double lado2) {
		System.out.println("A area do retangulo e " + lado1 * lado2);
	}
	
	public static void calculaArea(double baseMenor, double baseMaior, double altura) {
		System.out.println("A area do trapezio e " + ((baseMenor + baseMaior) * altura) / 2);
	}
}
