import java.util.Scanner;

public class Dois {
	
	public static void main (String args[]) {
		int contadorPar=0, contadorTotal=0;
		
		while(contadorPar < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				contadorPar++;
			}
			contadorTotal++;
		}
		
		System.out.println("A quantidade de numeros digitados foram: "+contadorTotal+"\nQuantidade de pares foi: "+contadorPar);
	}

}