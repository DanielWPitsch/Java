import java.util.Scanner;

/**
** Função : Contador recursivo dos numeros contidos em 762021192
** Autor : Daniel Warella Pitsch
** Data : 08/09/2023
** Observações:
*/

public class ED2Lista1Questao04 {
	
	public static void main (String args[]) {
		int n = 762021192;
		
		System.out.println("Informe o numero: ");
		Scanner sc = new Scanner(System.in);
        int digito = sc.nextInt();

        int resultado = contador(n, digito);

        System.out.println("Ocorre " + resultado);
		System.out.println("-Fim-");
	}
	
	public static int contador(int n, int digito) {
        if (n == 0) {
            return 0;
        } else {
            int ultimoDigito = n % 10;
            if (ultimoDigito == digito) {
                return 1 + contador(n / 10, digito);
            } else {
                return contador(n / 10, digito);
            }
        }
    }

}
