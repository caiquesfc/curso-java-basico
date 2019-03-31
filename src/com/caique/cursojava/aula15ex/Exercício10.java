package com.caique.cursojava.aula15ex;

import java.util.Scanner;

public class Exercício10 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		System.out.println("Digite M(Matutino), V(Vespertino), N(Noturno): ");
		String letra = teclado.next(); 
		if ("M".equalsIgnoreCase(letra)){
			System.out.println("Bom Dia!");
		}else if("V".equalsIgnoreCase(letra)){
			System.out.println("Boa Tarde!");
		}else if("N".equalsIgnoreCase(letra)){
			System.out.println("Boa Noite!");
		}else{
			System.out.println("Valor Invalido!");

		}
	}

}
