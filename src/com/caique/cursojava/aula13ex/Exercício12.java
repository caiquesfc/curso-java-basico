package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício12 {

	private static Scanner scan;

	public static void main(String[] args) {
		
        double altura;
        double soma;
		
		
		System.out.println("Digite sua altura: ");
		scan = new Scanner(System.in);
		altura = scan.nextDouble();
		
		soma = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é: " + soma);
		
	}

}
