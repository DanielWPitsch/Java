package ola;
import java.util.Scanner;

public class Mcinco {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		double media = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.format("MEDIA = %.1f",media);
		System.out.print("\n");
	}

}
