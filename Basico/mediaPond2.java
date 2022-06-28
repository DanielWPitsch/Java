package ola;
import java.util.Scanner;

public class Mquatro {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextFloat();
		double n2 = sc.nextFloat();
		double media = ((n1*3.5)+(n2*7.5))/11;
		System.out.format("MEDIA = %.5f",media);
		System.out.print("\n");
	}
}
