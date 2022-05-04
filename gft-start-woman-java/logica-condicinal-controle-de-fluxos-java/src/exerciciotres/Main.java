package exerciciotres;

public class Main {

	public static void main(String[] args) {
		int numMes = 3, numValor = 6;
		String nomeMes = "julho", nomeSemana = "quinta";
		
		
		ifMes(numMes);
		ifFerias(nomeMes);
		switchSemana(nomeSemana);
		switchValor(numValor);
		
	}
	
	private static void ifMes(int numero) {
		if(numero == 1) {
			System.out.println("Janeiro.");
		}
		else if(numero == 2) {
			System.out.println("Fevereiro.");
		}
		else if(numero == 3) {
			System.out.println("Marco.");
		}
		else if(numero == 4) {
			System.out.println("Abril.");
		}
		else if(numero == 5) {
			System.out.println("Maio.");
		}
		else if(numero == 6) {
			System.out.println("Junho.");
		}
		else if(numero == 7) {
			System.out.println("Julho.");
		}
		else if(numero == 8) {
			System.out.println("Agosto.");
		}
		else if(numero == 9) {
			System.out.println("Setembro.");
		}
		else if(numero == 10) {
			System.out.println("Outubro.");
		}
		else if(numero == 11) {
			System.out.println("Novembro.");
		}
		else if(numero == 12) {
			System.out.println("Dezembro.");
		}
	}

	private static void ifFerias(String nome) {
		if(nome == "julho" || nome == "dezembro" || nome == "janeiro") {
			System.out.println("Ferias.");
		}
	}

	private static void switchSemana(String nome) {
		switch(nome) {
		
		case "domingo":
			System.out.println("1");
			break;
			
		case "segunda":
			System.out.println("2");
			break;
		
		case "terca":
			System.out.println("3");
			break;
			
		case "quarta":
			System.out.println("4");
			break;
			
		case "quinta":
			System.out.println("5");
			break;
			
		case "sexta":
			System.out.println("6");
			break;
		
		case "sabado":
			System.out.println("7");
			break;
		}
	}

	private static void switchValor(int numero) {
		switch(numero) {
		
		case 1:
			System.out.println("Certo.");
			break;
		
		case 2:
			System.out.println("Certo.");
			break;
		
		case 3:
			System.out.println("Certo.");
			break;
			
		case 4:
			System.out.println("Errado.");
			break;
		
		case 5:
			System.out.println("Talvez.");
			break;
		
		default:
			System.out.println("Valor invalido.");
		}
	}
}
