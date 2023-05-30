package ola;

import java.util.Scanner;

public class J1019 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int segundos = sc.nextInt();
		
		int minutos = segundos/60;
		segundos = segundos%60;
		int horas = minutos/60;
		minutos = minutos%60;
		 
		System.out.println(horas +":"+ minutos +":"+ segundos);  
	}

}
