import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite um nome: ");
		String nome = sc.nextLine();
		
		System.out.println("O numero é "+n1+" e o nome é "+nome);
		
		System.out.println("-Fim-");
		
	}

}

