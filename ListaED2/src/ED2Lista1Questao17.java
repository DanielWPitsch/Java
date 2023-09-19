import java.util.Scanner;

/**
** Função : Classe com método recursivo para calcular
a soma dos quadrados dos primeiros números inteiros positivos.
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao17 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        int input = scanner.nextInt();
        scanner.close();
        int resultado = somaQuadrados(input);
        System.out.println("A soma dos quadrados dos primeiros " + input + " números inteiros positivos é: " + resultado);
    }

    public static int somaQuadrados(int n) {
        if (n == 1) {
            return 1;
        } else {
            int somaMenor = somaQuadrados(n - 1);
            int somaAtual = somaMenor + (n * n);
            return somaAtual;
        }
    }
}
