import java.util.Scanner;

/**
** Função : Função recursiva de resto da divisão
** Autor : Daniel Warella Pitsch
** Data : 08/09/2023
** Observações:
*/

public class ED2Lista1Questao05 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o dividendo: ");
		int x = sc.nextInt();
		
		System.out.println("informe o divisor: ");
        int y = sc.nextInt();

        int resultado = resto(x, y);
        System.out.println("O resto da divisão é: " + resultado);
		System.out.println("-Fim-");
	}
	
	public static int resto(int a, int b) {
        if (a < b) {
            return a;
        }
        else if (a == b) {
            return 0;
        }
        else {
            return resto(a - b, b);
        }
    }

}
