package ola;

import java.io.IOException;
import java.util.Scanner;

public class J1013 {
	public static void main(String[] args) throws IOException {

	    Scanner sc = new Scanner(System.in);
	    String entrada = sc.nextLine();
	    String [] valores = entrada.split("\\s");

	    int a= Integer.parseInt(valores[0]); 
	    int b= Integer.parseInt(valores[1]);
	    int c= Integer.parseInt(valores[2]);

	    int maiorAb = (a+b+Math.abs(a - b))/2;
	    int maior = (maiorAb+c+Math.abs(maiorAb - c))/2;

	    System.out.println(maior+" eh o maior");

	}

}
