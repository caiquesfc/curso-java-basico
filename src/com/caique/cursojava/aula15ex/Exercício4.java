package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício4 {

	
	private static Scanner read;

	public static void main(String[] args) {
		
		System.out.println("introduza a letra:"); 
		   read = new Scanner(System.in); 
		   String N=read.next();
		   char c=N.charAt(0);
		   //N=read.nextLine(); 
		   switch(c){ 
		   case'a': System.out.println("A letra "+N+" é uma vogal"); break;
		   case'e': System.out.println("A letra "+N+" é uma vogal"); break;
		   case'i': System.out.println("A letra "+N+" é uma vogal"); break;
		   case'o': System.out.println("A letra "+N+" é uma vogal"); break;
		   case'u': System.out.println("A letra "+N+" é uma vogal"); break;
		      
		   default: System.out.println("a letra "+N+" é uma consoante"); 
		     } 
		 } 
		}
