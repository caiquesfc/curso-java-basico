package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício18 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
				
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
	    System.out.println("O número é par");
	    
		}else {
		System.out.println("O número é ímpar");
		}
		
		
		
		

	}

}
