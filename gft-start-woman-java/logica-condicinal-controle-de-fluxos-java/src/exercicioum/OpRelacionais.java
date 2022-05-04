package exercicioum;

public class OpRelacionais {
	public static void inteiros(int a, int b) {
		System.out.println("Operacoes entre inteiros:");
		System.out.println("a == b " + (a == b));
		System.out.println("a != b " + (a != b));
		System.out.println("a > b " + (a > b));
		System.out.println("a <= b " + (a <= b));
		System.out.println();
	}
	
	public static void floats(float a, float b) {
		System.out.println("Operacoes entre floats:");
		System.out.println("a == b " + (a == b));
		System.out.println("a != b " + (a != b));
		System.out.println("a > b " + (a > b));
		System.out.println("a <= b " + (a <= b));
		System.out.println();
	}
	
	public static void chars(char a, char b) {
		System.out.println("Operacoes entre chars:");
		System.out.println("a == b " + (a == b));
		System.out.println("a != b " + (a != b));
		System.out.println("a > b " + (a > b));
		System.out.println("a <= b " + (a <= b));
		System.out.println();
	}
	
	public static void strings(String a, String b) {
		System.out.println("Operacoes entre strings:");
		System.out.println("a == b " + (a == b));
		System.out.println("a != b " + (a != b));
		System.out.println("As operacoes >, <, >= e <= nao podem ser realizadas entre strings.");
		System.out.println();
	}
	
	public static void booleanos(boolean a, boolean b) {
		System.out.println("Operacoes entre booleanos:");
		System.out.println("a == b " + (a == b));
		System.out.println("a != b " + (a != b));
		System.out.println("As operacoes >, <, >= e <= nao podem ser realizadas entre booleanos.");
	}
}
