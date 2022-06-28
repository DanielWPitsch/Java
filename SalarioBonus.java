package ola;
import java.util.Scanner;

public class Msete {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		float salario = sc.nextFloat();
		float Vtotal = sc.nextFloat();
		double Sbonus = salario+(Vtotal*0.15);
		System.out.format("TOTAL = R$ %.2f", Sbonus);
		System.out.print("\n");
	}

}
