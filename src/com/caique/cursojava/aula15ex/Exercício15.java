package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exerc�cio15 {
	
	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		double numeroUm, numeroDois, numeroTres;
		
		inputNumScanner = new Scanner(System.in);
		
		 System.out.println("Insira o primeiro n�mero: ");
	      numeroUm = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o segundo n�mero: ");
	      numeroDois = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o terceiro n�mero: ");
	      numeroTres = inputNumScanner.nextDouble();
	      
	      
	      if (numeroUm == numeroDois && numeroDois == numeroTres && numeroUm == numeroTres) {
	    	  System.out.println("Tri�ngulo Equil�tero");
	    	  
	      }else if (numeroUm == numeroDois && numeroUm != numeroTres && numeroDois != numeroTres || numeroUm == numeroTres && numeroUm != numeroDois && numeroTres != numeroDois || numeroDois == numeroTres && numeroDois != numeroUm && numeroTres != numeroUm) {
	    	  System.out.println("Tri�ngulo Is�sceles");
	    	  
	      }else if (numeroUm != numeroDois && numeroUm != numeroTres || numeroDois != numeroUm && numeroDois != numeroTres || numeroTres != numeroUm && numeroTres != numeroDois) {
	    	  System.out.println("Tri�ngulo Escaleno");
	      }

	}

}
