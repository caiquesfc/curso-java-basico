package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exerc�cio14 {

	private static Scanner inputNumScanner;

	public static void main(String[] args) {
		
		 double soma = 0;
		 double media = 0, numeroUm, numeroDois;
		 double resultado = media;
		 		 
	     inputNumScanner = new Scanner(System.in);
	     
	     
	     System.out.println("Insira o primeiro n�mero: ");
	      numeroUm = inputNumScanner.nextDouble();
	      
	      System.out.println("Insira o segundo n�mero: ");
	      numeroDois = inputNumScanner.nextDouble();
	      
	     
	      
	      soma = numeroUm + numeroDois;
	      media = soma / 2;
	      resultado = media;
	      
	      
	      if (resultado >= 9 && resultado <= 10) {
	    	  System.out.println("A m�dia � = " + resultado);
	    	  System.out.println("Nota A");
	    	  System.out.println("APROVADO");
	    	  
	      }else if (resultado >= 7.5 && resultado < 9) {
	    	  System.out.println("A m�dia � = " + resultado);
	    	  System.out.println("Nota B");
	    	  System.out.println("APROVADO");
	    	  
	    	  
	      }else if (resultado >= 6 && resultado < 7.5) {
	    	  System.out.println("A m�dia � = " + resultado);
	    	  System.out.println("Nota C");
	    	  System.out.println("APROVADO");
	    	  
	      }else if (resultado >= 4 && resultado < 6) {
	    	  System.out.println("A m�dia � = " + resultado);
	    	  System.out.println("Nota D");
	    	  System.out.println("REPROVADO");
	    	  
	      }else if (resultado >= 0 && resultado < 4) {
	    	  System.out.println("A m�dia � = " + resultado);
	    	  System.out.println("Nota E");
	    	  System.out.println("REPROVADO");
	    	  	    	  
	    	  }
	          /*switch(resultado) {
	    	  case "A":
	    	  case "B":
	    	  case "C": System.out.println("APROVADO"); break;
	    	  case "D": 
	    	  case "E": System.out.println("REPROVADO"); break;
	    	  }*/
	      
	      
	      
	      
	      
	      

	}

}
