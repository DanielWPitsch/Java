import java.util.Scanner;

/**
** Função : Soma frações até pela quantidade de vezes que o divisor é dado
** Autor : Daniel Warella Pitsch
** Data : 08/09/2023
** Observações:
*/


public class ED2Lista1Questao01 {
	public static void main (String args[]) {
		
		System.out.println("Informe até qual casa de divisao você quer somar\nExemplo: "
				+ "Se você digitar 3, então será a soma de 1 + 1/2 + 1/3");
		Scanner sc = new Scanner(System.in);
		double divisor = sc.nextInt();
		double resultado = soma_fracao(divisor);
		
		System.out.println("A soma é: "+ resultado);
		System.out.println("-Fim-");
	}
	
	public static double soma_fracao(double n) {
	    if (n == 1) {
	    	return 1;
	    }else {
	    	return 1/n + soma_fracao(n - 1);
	    }
	}

}
