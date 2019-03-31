package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício5 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		
		System.out.print("Digite os metros: ");
		
		double metros = entrada.nextDouble();
		double centimetros = metros * 100;
		System.out.printf("%.1f cm" ,centimetros);
		
		
		

	}

}
