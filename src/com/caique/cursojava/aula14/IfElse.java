package com.caique.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	private static Scanner scan;

	public static void main(String[] args) {

         scan = new Scanner(System.in);
         
         /*System.out.println("Digite a sua idade: ");
         
         int idade = scan.nextInt();
         
         if (idade >= 18){
         
         System.out.println("� maior de idade.");
         
         
         } else {
        	 System.out.println("N�o � maior de idade.");
         }*/
          
         
         //barato <= 10
         //10 < valor < 15 - pedir desconto
         //15 <= valor 17 - pesquisar mais
         //>= 17 - muito caro
         
         
         System.out.println("Digite o pre�o desejado: ");
         double valor = scan.nextDouble(); 
         
         if (valor <= 10) {
         System.out.println("Est� barato para comprar");
        	
         } else if (valor > 10 && valor < 15) {
         System.out.println("Voc� pode pedir um desconto");
         
         }else if (valor >= 15 && valor < 17) {
         System.out.println("Pesquisar mais");
         
         }else // valor >= 17
         System.out.println("Muito caro");
         {
         
         }
         
       

	}

}
