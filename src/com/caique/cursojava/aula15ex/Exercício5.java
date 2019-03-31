package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício5 {
	
	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		double soma = 0;
		 double media = 0, numeroUm, numeroDois;
		 double resultado = media;
	     inputNumScanner = new Scanner(System.in);
	     
	     System.out.println("Insira o primeiro número: ");
	      numeroUm = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o segundo número: ");
	      numeroDois = inputNumScanner.nextDouble();
	      
	      
	      soma = numeroUm + numeroDois;
	      media = soma / 2;
	      resultado = media;
	      
	      System.out.println("A média é = " + resultado);
	      
	      if (resultado >= 70 && resultado < 100) {
		    	System.out.println("Aprovado");
		    	
		       
		    }else if (resultado < 70) {
		    	System.out.println("Reprovado");
	      
		    }else if (resultado == 100) {
			    	System.out.println("Aprovado com distinção");
	      
		
		

	}
	}

}
