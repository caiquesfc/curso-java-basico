package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício8 {
	
	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		int p1, p2, p3;
	    inputNumScanner = new Scanner(System.in);
	      
	      
	      System.out.println("Insira o preço do primeiro produto: ");
	      p1 = inputNumScanner.nextInt();
	      
	 
	      System.out.println("Insira o preço do segundo produto: ");
	      p2 = inputNumScanner.nextInt();
	      
	      
	      System.out.println("Insira o preço do terceiro produto: ");
	      p3 = inputNumScanner.nextInt();
	      
	      
	      if (p1 < p2 && p1 < p3){
	          System.out.println("O primeiro produto é o mais barato");
	          
	      }else if (p2 < p1 && p2 < p3){
		      System.out.println("O segundo produto é o mais barato");
		          
	      }else if (p3 < p1 && p3 < p2){
			  System.out.println("O terceiro produto é o mais barato");
			  
			  
			  
	      }
	}
}

	    	
	      
	      
	      
