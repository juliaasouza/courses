package exercicioum;

public class Main {

	public static void main(String[] args) {
		int i1 = 10, i2 = 20;
		float f1 = 4.5f, f2 = 3.5f;
		char c1 = 'x', c2 = 'y';
		String s1 = "Fulano", s2 = "Fulano";
		boolean b1 = true, b2 = false;
		
		OpRelacionais.inteiros(i1, i2);
		OpRelacionais.floats(f1, f2);
		OpRelacionais.chars(c1, c2);
		OpRelacionais.strings(s1, s2);
		OpRelacionais.booleanos(b1, b2);
		
	}

}
