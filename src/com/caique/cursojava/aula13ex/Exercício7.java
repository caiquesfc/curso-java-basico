package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício7 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		double base;	
	    double altura;	
	    double area;
		 
		
		System.out.println("Digite o valor da base: ");
		scan = new Scanner(System.in);
		base = scan.nextDouble();
		
		
		System.out.println("Digite o valor da altura: ");
		scan = new Scanner(System.in);
		altura = scan.nextDouble();
		
		area = base * altura;
		
		System.out.println("O valor da área é: " + area);
		System.out.println("O valor do dobro da área do quadrado é: " + area * 2);

	}

}
