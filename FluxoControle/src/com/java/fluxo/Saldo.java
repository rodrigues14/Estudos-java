package com.java.fluxo;

import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float saldo = 0;
		System.out.println("Seu saldo é: " + saldo);
		
		System.out.println("Qual o valor do depósito?");
		float deposito = sc.nextFloat();
		
		saldo += deposito;
		
		System.out.println("Seu saldo atual é: " + saldo);
		
		sc.close();
		
	}
	
}
