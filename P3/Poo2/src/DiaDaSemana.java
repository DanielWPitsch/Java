import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int continua = 1;
		
		do {
			System.out.println("Informe um numero entre 1 e 7");
			int dia = sc.nextInt();
			
			
			switch(dia) {
				case 1:
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Segunda");
					break;
				case 3:
					System.out.println("Terça");
					break;
				case 4:
					System.out.println("Quarta");
					break;
				case 5:
					System.out.println("Quinta");
					break;
				case 6:
					System.out.println("Sexta");
					break;
				case 7:
					System.out.println("Sábado");
					break;
				default:
					System.out.println("entrada invalida");
					break;
			
			}
			System.out.println("\nDeseja digitar um novo numero? \n1-Sim\n2-Não");
			continua = sc.nextInt();
		}while(continua != 2);
		System.out.println("-Fim-");
	}
}
