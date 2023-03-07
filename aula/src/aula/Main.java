package aula;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		System.out.println("hello world!");
		System.out.println("syso CTRL+espaço");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();

		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("O nome eh "+nome+ " e a sua idade eh "+idade);
		
	}

}
