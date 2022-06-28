package ola;

import java.util.Scanner;
import java.lang.Math;

public class J1016 {
	
	public static void main(String args[]){
        
		Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String [] valores = entrada.split("\\s");

        float x1= Float.parseFloat(valores[0]); 
        float y1= Float.parseFloat(valores[1]);
        
        String entrada2 = sc.nextLine();
        String [] valores2 = entrada2.split("\\s");
        
        float x2= Float.parseFloat(valores2[0]); 
        float y2= Float.parseFloat(valores2[1]);

        float distancia = (float) Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
        
        System.out.format("%.4f" , distancia);
        System.out.println();
	}

}
