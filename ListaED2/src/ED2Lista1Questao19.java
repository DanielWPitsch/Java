import java.util.Scanner;

/**
** Função : Ler um númer inteiro positivo e, então calcular o desenvolvimento do polinômio
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao19 {
	
	public static int coeficienteBinomial(int n, int k) {

        if (k == 0 || k == n) {
            return 1;
        }

        return coeficienteBinomial(n - 1, k - 1) + coeficienteBinomial(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro positivo n < 10: ");
        int n = scanner.nextInt();


        if (n < 0 || n >= 10) {
            System.out.println(" o numero deve ser um número inteiro positivo menor que 10");
            return;
        }

        System.out.print("(x + 1)^" + n + " = ");
        for (int i = 0; i <= n; i++) {
            int coeficiente = coeficienteBinomial(n, i);
            if (i > 0) {
                System.out.print(" + ");
            }
            System.out.print(coeficiente + "x^" + i);
        }
        System.out.println();

        System.out.println("Triângulo de Pascal gerado:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                int coeficiente = coeficienteBinomial(i, j);
                System.out.print(coeficiente + " ");
            }
            System.out.println();
        }
        System.out.println("-Fim-");
    }

}
