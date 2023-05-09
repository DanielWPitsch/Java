import java.util.Scanner;

public class Pares {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numero, contador=0;
		
		System.out.println("Informe um numero: ");
		numero = sc.nextInt();
		
		do {
			if(numero %2 != 0) {
				numero--;
			}
			
			System.out.println(" "+numero);
			numero--;
			
		}while(numero >= contador);
		System.out.println("-Fim-");
	}
}
