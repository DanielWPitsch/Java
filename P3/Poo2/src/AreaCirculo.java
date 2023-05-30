package ola;

import java.util.Scanner;

public class Dois {
	public static void main (String args[]) {
		double n = 3.14159;
		Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = n*(r*r);
        System.out.format("A=%.4f", a);
        System.out.print("\n");
	}
}
