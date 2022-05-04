package exerciciotres;

public class Main {

	public static void main(String[] args) {
		System.out.println("Testes dos retornos");
		
		double areaQuadrado = Retorno.calculaArea(4);
		System.out.println("A area do quadrado e: " + areaQuadrado);
		
		double areaRetangulo = Retorno.calculaArea(4, 3);
		System.out.println("A area do retangulo e: " + areaRetangulo);
		
		double areaTrapezio = Retorno.calculaArea(4, 3 ,2);
		System.out.println("A area do trapezio e: " + areaTrapezio);
	}

}
