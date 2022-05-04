package exerciciodois;

public class Main {

	public static void main(String[] args) {
		boolean b1 = true, b2 = true, b3 = false, b4 = false;
		
		System.out.println(b1 == b2 && b3 == b4);
		System.out.println(b1 == b3 && b3 == b4);
		System.out.println(b1 == b3 && b1 == b4);
		System.out.println(b1 == b2 && b2 == b4);
		
		System.out.println();
		
		System.out.println(b1 == b2 || b3 == b4);
		System.out.println(b1 == b3 || b3 == b4);
		System.out.println(b1 == b3 || b1 == b4);
		System.out.println(b1 == b2 || b2 == b4);
	}

}
