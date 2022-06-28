package ola;
import java.util.Scanner;

public class Mseis {	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int dif = (n1*n2-n3*n4);
		System.out.format("DIFERENCA = "+dif);
		System.out.print("\n");
	}

}
