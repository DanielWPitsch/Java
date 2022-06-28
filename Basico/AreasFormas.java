package ola;
import java.io.IOException;
import java.util.Scanner;

 
public class rascunho {
 
    public static void main(String[] args) throws IOException {
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String [] valores = entrada.split("\\s");

        float a= Float.parseFloat(valores[0]); 
        float b= Float.parseFloat(valores[1]);
        float c= Float.parseFloat(valores[2]);

        System.out.format("TRIANGULO: %.3f", (a*c)/2);
        System.out.format("\nCIRCULO: %.3f", pi*(Math.pow(c, 2)));
        System.out.format("\nTRAPEZIO: %.3f", ((a+b)*c)/2);
        System.out.format("\nQUADRADO: %.3f", (Math.pow(b, 2)));
        System.out.format("\nRETANGULO: %.3f", (a*b));
        System.out.print("\n");

    }
 
}