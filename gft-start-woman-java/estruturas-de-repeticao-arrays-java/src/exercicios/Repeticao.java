package exercicios;

import java.util.Scanner;

public class Repeticao {
	public static void nomeIdade() {
		while(true) {
			System.out.println("Insira o nome do aluno e sua idade:");
			Scanner scan = new Scanner(System.in);
			String nome = scan.next();

			if(nome.equals ("0")) {
				break;
			}
			
			int idade = scan.nextInt();
		}	
	}
	
	public static void nota() {
		int nota = -1;
		
		while(nota < 0 || nota > 10) {
			System.out.println("Insira uma nota entre 0 e 10:");
			Scanner scan = new Scanner(System.in);
			nota = scan.nextInt();
		}
	}
	
	public static void maiorMedia() {
		int counter = 0, maior = 0, acumulador = 0;
		
		do {
			System.out.println("Insira um numero:");
			Scanner scan = new Scanner(System.in);
			int novoNum = scan.nextInt();
			
			if(novoNum > maior) {
				maior = novoNum;
			}
			
			acumulador += novoNum;
			++counter;
		}
		while(counter < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Media: " + (acumulador/5));
	}
	
	public static void parImpar() {
		int counter = 0, nPar = 0, nImpar = 0;
		
		System.out.println("Quantos numeros serao inseridos?");
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		
		do {
			System.out.println("Insira um numero:");
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				++nPar;
			}
			else {
				++nImpar;
			}
			
			++counter;
		}
		while(counter < max);
		
		System.out.println("Numeros pares: " + nPar);
		System.out.println("Numeros impares: " + nImpar);	
	}
	
	public static void tabuada() {
		System.out.println("Qual tabuada deseja ver?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= 10; ++i) {
			System.out.println(n + " X " + i + " = " + n*i);
		}
	}
	
	public static void fatorial() {
		System.out.println("Qual fatorial deseja calcular?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int fatorial = 1;
		
		for(int i = n; i > 0; --i) {
			fatorial *= i;
		}
		
		System.out.println(n + "! = " + fatorial);
	}
}
