package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício15 {
	
	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		double numeroUm, numeroDois, numeroTres;
		
		inputNumScanner = new Scanner(System.in);
		
		 System.out.println("Insira o primeiro número: ");
	      numeroUm = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o segundo número: ");
	      numeroDois = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o terceiro número: ");
	      numeroTres = inputNumScanner.nextDouble();
	      
	      
	      if (numeroUm == numeroDois && numeroDois == numeroTres && numeroUm == numeroTres) {
	    	  System.out.println("Triângulo Equilátero");
	    	  
	      }else if (numeroUm == numeroDois && numeroUm != numeroTres && numeroDois != numeroTres || numeroUm == numeroTres && numeroUm != numeroDois && numeroTres != numeroDois || numeroDois == numeroTres && numeroDois != numeroUm && numeroTres != numeroUm) {
	    	  System.out.println("Triângulo Isósceles");
	    	  
	      }else if (numeroUm != numeroDois && numeroUm != numeroTres || numeroDois != numeroUm && numeroDois != numeroTres || numeroTres != numeroUm && numeroTres != numeroDois) {
	    	  System.out.println("Triângulo Escaleno");
	      }

	}

}
