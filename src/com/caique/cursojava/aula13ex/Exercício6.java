package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício6 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		double raio;
		double area;
		final double PI = 3.1416;

		System.out.println("Digite o valor do raio:");
			scan = new Scanner(System.in);
			raio = scan.nextDouble();

		area  = PI* Math.pow(raio, 2);

		System.out.print("O valor da area é: " + area);
		
	}

}
