package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
	
	public static void ordemInversa() {
		int numeros[];
		numeros = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; ++i) {
			System.out.println("Insira um numero:");
			numeros[i] = scan.nextInt();
		}
		
		for(int i = 4; i >= 0; --i) {
			System.out.print(numeros[i] + " ");
		}
	}
	
	public static void consoantes() {
		String consoantes[] = new String[6]; //um array de strings em vez de char pra poder usar o metodo equalsIgnoreCase
		Scanner scan = new Scanner(System.in);
		int nConsoantes = 0;
		
		for(int i = 0; i < 6; ++i) {
			System.out.println("Insira uma letra:");
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
					letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {
				consoantes[nConsoantes] = letra;
				++nConsoantes;
			}
		}
		
		System.out.println("Foram inseridas " + nConsoantes + " consoantes, sendo elas:");
		
		for(int i = 0; i < nConsoantes; ++i) {
			System.out.print(consoantes[i] + " ");
		}
	}
	
	public static void numerosAleatorios(){
		Random random = new Random();
		int numeros[] = new int[20];
		
		for(int i = 0; i < 20; ++i) {
			int n = random.nextInt(100);
			numeros[i] = n;
		}
		
		System.out.println("Numeros aleatorios:");
		
		for(int i = 0; i < 20; ++i) {
			if(i == 19) {
				System.out.println(numeros[i]); // pra dar enter no final da sequencia e ficar bonito
			}
			else {
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println("Sucessores:");
		
		for(int i = 0; i < 20; ++i) { // ou for(n : numeros){ print(n)}
			if(i == 19) {
				System.out.println(numeros[i]+1); 
			}
			else {
				System.out.print((numeros[i]+1) + " ");
			}
		}
	}
	
	public static void arrayMultidimensional() {
		Random random = new Random();
		int matriz[][] = new int[4][4];
		int menor = 101, imenor = 0, jmenor = 0;
		
		for(int i = 0; i < 4; ++i) {
			for(int j = 0; j < 4; ++j) {
				int n = random.nextInt(9);
				matriz[i][j] = n;
				
				if(n < menor) {
					menor = n;
					imenor = i;
					jmenor = j;
				}
			}
		}
		
		System.out.println("O menor elemento da matriz e " + menor + ", na posicao " + imenor + " " + jmenor);
	}
}
