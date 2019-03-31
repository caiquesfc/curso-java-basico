package com.caique.cursojava.aula13ex;

import java.util.Scanner;

public class Exercício10 {

	private static Scanner scan;

	public static void main(String[] args) {
		
        double F;
		float C = 0;
        
        System.out.println("Digite a temperatura em Celsius: ");
        scan = new Scanner(System.in);
		C = (float) scan.nextFloat();
				     		
        F = ((C) * 1.8) + 32 ;
				
        System.out.println("A temperatura em graus Fahrenheit é: " + F);
        

	}

}
