package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício3 {

	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		 int soma = 0, numeroUm, numeroDois;
	     inputNumScanner = new Scanner(System.in);
	      
	      
	      System.out.println("Insira o primeiro número: ");
	      numeroUm = inputNumScanner.nextInt();
	      
	 
	      System.out.println("Insira o segundo número: ");
	      numeroDois = inputNumScanner.nextInt();
	      
	 
	      soma = numeroUm + numeroDois;
	 
	      System.out.println("A soma dos dois números é = " + soma);
	    
	    
	}

}
