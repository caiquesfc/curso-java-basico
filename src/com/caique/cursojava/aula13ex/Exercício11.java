package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exerc�cio11 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		double soma1;
		double soma2;
		double soma3;
		double numero1;
		double numero2;
		double numero3;
		
		System.out.println("Digite um n�mero inteiro: ");
		scan = new Scanner(System.in);
		numero1 = scan.nextDouble();
		
		System.out.println("Digite outro n�mero inteiro: ");
		scan = new Scanner(System.in);
		numero2 = scan.nextDouble();
		
		System.out.println("Digite um n�mero real: ");
		scan = new Scanner(System.in);
		numero3 = scan.nextDouble();
		
		soma1 = (numero1 * 2 * numero2/2);		
		System.out.println("O prodruto do dobro do primeiro com metade do segundo �: " + soma1);
		
		
		soma2 = (numero1 * 3 + numero3);
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + soma2);
		
		soma3 = (numero3 * numero3 * numero3);
		System.out.println("O terceiro n�mero elevado ao cubo: " + soma3);
		

	}

}
