package com.java.fluxo;

import java.util.Scanner;

public class LeituraDeDados {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite o primeiro n�mero: ");
			int num1 = sc.nextInt();
			
			System.out.print("Digite o segundo n�mero: ");
			int num2 = sc.nextInt();
			
			int soma = num1 + num2;
			
			System.out.println("A soma entre " + num1 + " e " + num2 + " �: "+ soma);
			
			int resto = soma % 2; 
			if (resto == 0) {
				System.out.println("E o valor � par");
			} else {
				System.out.println("E o valor � impar");
			}
			
			sc.close();
		}
}
