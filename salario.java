package ola;

import java.util.Scanner;

public class Tress {

			 
		    public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
				int ht = sc.nextInt();
				float v = sc.nextFloat();
		        float s = ht*v;
		        System.out.println("NUMBER = "+n);
		        System.out.format("SALARY = U$ %.2f", s);
		        System.out.print("\n");
		    }
		 


}
