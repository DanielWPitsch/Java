package ola;

import java.util.Scanner;

public class J1021 {
	public static void main (String args[]) {

		Scanner sc = new Scanner(System.in);
		double resto = sc.nextDouble();
		
		System.out.println("NOTAS:");
		
		double notas = resto/100;
		resto = resto%100;
		int notas2 = (int) notas;
		System.out.println(notas2 + " nota(s) de R$ 100.00");
		
		notas = resto/50;
		resto = resto%50;
		notas2 = (int) notas;
		System.out.println(notas2 + " nota(s) de R$ 50.00");
		
		notas = resto/20;
		resto = resto%20;
		notas2 = (int) notas;
		System.out.println(notas2 + " nota(s) de R$ 20.00");
		
		notas = resto/10;
		resto = resto%10;
		notas2 = (int) notas;
		System.out.println(notas2 + " nota(s) de R$ 10.00");
		
		notas = resto/5;
		resto = resto%5;
		notas2 = (int) notas;
		System.out.println(notas2 + " nota(s) de R$ 5.00");
		
		notas = resto/2;
		resto = resto%2;
		notas2 = (int) notas;
		System.out.println(notas2 + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		
		notas = resto/1;
		resto = resto%1;
		notas2 = (int) notas;
		System.out.println(notas2 + " moeda(s) de R$ 1.00");  
		
		notas = resto/0.50;
		resto = resto%0.50;
		notas2 = (int) notas;
		System.out.println(notas2 + " moeda(s) de R$ 0.50");
		
		notas = resto/0.25;
		resto = resto%0.25;
		notas2 = (int) notas;
		System.out.println(notas2 + " moeda(s) de R$ 0.25");
		
		notas = resto/0.10;
		resto = resto%0.10;
		notas2 = (int) notas;
		System.out.println(notas2 + " moeda(s) de R$ 0.10");
		
		notas = resto/0.05;
		resto = resto%0.05;
		notas2 = (int) notas;
		System.out.println(notas2 + " moeda(s) de R$ 0.05");
		
		notas = Math.round(resto*100);
		notas2 = (int) notas;
		System.out.println(notas2 + " moeda(s) de R$ 0.01"); 
		
		
		
	}

}
