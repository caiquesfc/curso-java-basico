package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exerc�cio8 {
	
	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		int p1, p2, p3;
	    inputNumScanner = new Scanner(System.in);
	      
	      
	      System.out.println("Insira o pre�o do primeiro produto: ");
	      p1 = inputNumScanner.nextInt();
	      
	 
	      System.out.println("Insira o pre�o do segundo produto: ");
	      p2 = inputNumScanner.nextInt();
	      
	      
	      System.out.println("Insira o pre�o do terceiro produto: ");
	      p3 = inputNumScanner.nextInt();
	      
	      
	      if (p1 < p2 && p1 < p3){
	          System.out.println("O primeiro produto � o mais barato");
	          
	      }else if (p2 < p1 && p2 < p3){
		      System.out.println("O segundo produto � o mais barato");
		          
	      }else if (p3 < p1 && p3 < p2){
			  System.out.println("O terceiro produto � o mais barato");
			  
			  
			  
	      }
	}
}

	    	
	      
	      
	      
