package exercicioum;

// Eu achei o modo feito pelo professor (com switch) feio

public class Horario {
	
	public static void diaTardeNoite(int hora){
		if(hora > 6 && hora < 12) {
			System.out.println("Bom dia!");
		}
		
		else if(hora < 18){
			System.out.println("Boa tarde!");
		}
		
		else{
			System.out.println("Boa noite!");
		}
	}
	
}
