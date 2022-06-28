package ola;

import java.util.Scanner;

public class J1014 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		float y = sc.nextFloat();
		
		float consumo = x/y;
		
		System.out.format("%.3f km/l", consumo);
		System.out.println();
	}
}
