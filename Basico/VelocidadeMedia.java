package ola;

import java.util.Scanner;

public class J1017 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int tempo = sc.nextInt();
		float velocidadeM = sc.nextFloat();

		velocidadeM =  (tempo*velocidadeM)/12;
		System.out.format("%.3f\n", velocidadeM);
	}

}
