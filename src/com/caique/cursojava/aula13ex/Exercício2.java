package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exerc�cio2 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
	    
	    System.out.println("Digite um n�mero:");
	    String numero = scan.nextLine();
		
		System.out.println("O n�mero informado foi: " + numero);

	}

}
