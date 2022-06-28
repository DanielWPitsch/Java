package ola;

import java.util.Scanner;

public class Rasc {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int resto = sc.nextInt();
		System.out.println(resto);
		
		int notas = resto/100;
		resto = resto%100;
		System.out.println(notas + " nota(s) de R$ 100,00");
	}

}
