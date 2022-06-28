package ola;
import java.util.Scanner;

public class Moito {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		String[] valores = linha.split("\\s");
		int a = Integer.parseInt(valores[0]); int b = Integer.parseInt(valores[1]); float c = Float.parseFloat(valores[2]);
		String linha2 = sc.nextLine();
		String[] valores2 = linha2.split("\\s");
		int m = Integer.parseInt(valores2[0]); int n = Integer.parseInt(valores2[1]); float o = Float.parseFloat(valores2[2]);
		double total = (b*c)+(n*o);
		System.out.format("VALOR A PAGAR: R$ %.2f", total);
		System.out.print("\n");
		
		sc.close();
	}

}
