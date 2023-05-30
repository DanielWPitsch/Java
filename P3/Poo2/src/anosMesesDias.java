package ola;

import java.util.Scanner;

public class J1020 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int dias = sc.nextInt();

		int anos = dias/365;
		int meses = (dias-(anos*365))/30;
		dias = (dias-(anos*365))%30;
		
		System.out.println(anos +" ano(s)");
		System.out.println(meses +" mes(es)");
		System.out.println(dias +" dia(s)");  
	}

}
