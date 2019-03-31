package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício2 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
	    
	    System.out.println("Digite um número:");
	    String numero = scan.nextLine();
		
		System.out.println("O número informado foi: " + numero);

	}

}
