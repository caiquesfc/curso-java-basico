package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exerc�cio18 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
				
		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
	    System.out.println("O n�mero � par");
	    
		}else {
		System.out.println("O n�mero � �mpar");
		}
		
		
		
		

	}

}
