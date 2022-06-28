package ola;

import java.util.Scanner;

public class Monze {
	public static void main (String args[]) {
		
		double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		double volume = (4/3.0) * pi * (Math.pow(R, 3));
		System.out.format("VOLUME = %.3f", volume);
		System.out.print("\n");
		sc.close();
		
	}

}

