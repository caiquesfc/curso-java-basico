package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício9 {

	private static Scanner scan;

	public static void main(String[] args) {
		
        float C, F = 0;
        
        System.out.println("Digite a temperatura em Fahrenheit: ");
        scan = new Scanner(System.in);
		F = (float) scan.nextFloat();	
				     		
        C = (5 * (F-32))/9;
				
        System.out.println("A temperatura em graus Celsius é: " + C);
        

	}

}
