package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exerc�cio9 {
	
	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		
		int num1, num2, num3;
	    inputNumScanner = new Scanner(System.in);
	      
	      
	      System.out.println("Insira o primeiro n�mero: ");
	      num1 = inputNumScanner.nextInt();
	      
	 
	      System.out.println("Insira o segundo n�mero: ");
	      num2 = inputNumScanner.nextInt();
	      
	      
	      System.out.println("Insira o terceiro n�mero: ");
	      num3 = inputNumScanner.nextInt();
	      
	      
	      if (num1 > num2 && num1 > num3 && num2 > num3 && num2 < num1) {
	      System.out.println("A ordem �: "); 
	      System.out.println(num1);
	      System.out.println(num2);
	      System.out.println(num3);
	      
	      }else if (num1 > num2 && num1 > num3 && num3 > num2 && num3 < num1) {
		      System.out.println("A ordem �: "); 
		      System.out.println(num1);
		      System.out.println(num3);
		      System.out.println(num2);
	      
	      }else if (num2 > num1 && num2 > num3 && num1 > num3 && num1 < num2) {
	    	  System.out.println("A ordem �: "); 
		      System.out.println(num2);
		      System.out.println(num1);
		      System.out.println(num3);
		      
	      }else if (num2 > num1 && num2 > num3 && num3 > num1 && num3 < num2) {
	    	  System.out.println("A ordem �: "); 
		      System.out.println(num2);
		      System.out.println(num3);
		      System.out.println(num1);
		      
		      
	      }else if (num3 > num2 && num3 > num1 && num2 < num3 && num2 > num1) {
	    	  System.out.println("A ordem �: "); 
		      System.out.println(num3);
		      System.out.println(num2);
		      System.out.println(num1);
		      
	      }else if (num3 > num2 && num3 > num1 && num1 < num3 && num1 > num2) {
	    	  System.out.println("A ordem �: "); 
		      System.out.println(num3);
		      System.out.println(num1);
		      System.out.println(num2);
		      
	      }else if (num3 == num2 && num3 == num1 && num2 == num3 && num2 == num1) {
	    	  System.out.println("A ordem �: "); 
		      System.out.println(num1);
		      System.out.println(num2);
		      System.out.println(num3);
	    	  
	      }
	}
	
	}


