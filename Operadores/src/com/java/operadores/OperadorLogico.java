package com.java.operadores;

public class OperadorLogico {
	public static void main(String[] args) {
		
		int a = 20, b = 3;
		boolean verificar = a < 30 && b > 0;
		System.out.println(verificar);
		
		int nrAmarelo = 2, nrVermelho = 0;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);
		
		int x = 9, y = 11;
		//para ser true, só uma condição pode ser true.
		boolean teste = x > 10 ^ y > 10;
		System.out.println(teste);
		
		int idade = 20;
		boolean maioridade = !(idade >= 18);
		System.out.println(maioridade);
	}
}  
