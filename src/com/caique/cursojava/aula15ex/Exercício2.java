package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exerc�cio2 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);	
		
		System.out.println("Digite um valor: ");
	    int valor = scan.nextInt();
	    
	    if (valor > 0) {
	    	System.out.println("O valor � positivo");
	    	
	       
	    }else System.out.println("O valor � negativo");
	    

	}

}
