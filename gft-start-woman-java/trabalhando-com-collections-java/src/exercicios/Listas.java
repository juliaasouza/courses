package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Listas {
	
	public static void temperatura() {
		Scanner scan = new Scanner(System.in);
		int acumulador = 0, index = -1;
		List<Double> lista = new ArrayList<>();
		
		for(int i = 0; i < 6; ++i) { // recebe as temperaturas
			System.out.println("Temperatura:");
			double n = scan.nextInt();
			lista.add(n);
			acumulador += n;
		}
		
		double media = acumulador/lista.size(); //lista.size() deixa o codigo mais generico, entao eu preferi usar
											 // ainda que o numero de elementos seja fixo
		
		List <String> meses = new ArrayList<>(); // eu podia ter imprimido o mes com if/else ou switch/case
		meses.add("Janeiro");					 // mas achei que implementar outra lista ia mais no espirito
		meses.add("Fevereiro");					 // do exercicio
		meses.add("Marco");
		meses.add("Abril");
		meses.add("Maio");
		meses.add("Junho");
		
		System.out.println("Temperaturas acima da media (" + media + "): ");
		for(double n : lista) {		
			if(n > media) {
				index = lista.indexOf(n);
				String mes  = meses.get(index);
				
				System.out.println((index+1) + " - " + mes);
				}
			}
		if(index < 0) {
			System.out.println("Nao houveram temperaturas acima da media.");
		}
		
	}


	public static void perguntas() {
		List<String> respostas = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vitima?");
		String s = scan.next();
		respostas.add(s.toLowerCase());
		System.out.println("Esteve no local do crime?");
		s = scan.next();
		respostas.add(s.toLowerCase());
		System.out.println("Mora perto da vitima?");
		s = scan.next();
		respostas.add(s.toLowerCase());
		System.out.println("Devia para a vitima?");
		s = scan.next();
		respostas.add(s.toLowerCase());
		System.out.println("Ja trabalhou com a vitima?");
		s = scan.next();
		respostas.add(s.toLowerCase());
		
		int count = 0;
		Iterator<String> it = respostas.iterator();
		
		while(it.hasNext()) {
			String resposta = it.next();
			if(resposta.contains("s")) {
				++count;
			}
		}
		
		switch(count) {
			case 2:
				System.out.println("SUSPEITA");
				break;
			case 3:
			case 4:
				System.out.println("CUMPLICE");
				break;
			case 5:
				System.out.println("ASSASSINO");
				break;
			default:
				System.out.println("INOCENTE");
		}
		
	}
}
