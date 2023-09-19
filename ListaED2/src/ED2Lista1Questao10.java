import java.util.Random;

/**
** Função : Menor e o maior valor de um array aleatorio entre 1 e 1.000.000
** Autor : Daniel Warella Pitsch
** Data : 09/09/2023
** Observações:
*/

public class ED2Lista1Questao10 {
	public static void main(String[] args) {
        int[] array = gerarArray(5);
        for (int i = 0; i < 5; i++) {
            System.out.printf(array[i]+"\n");
        }
        int max = maior(array, 5, 0, 0);
        int min = menor(array, 5, 0, 0);
        System.out.printf("O maior numero foi: " + max);
        System.out.printf("\nO menor numero foi: " + min);
    }

    public static int[] gerarArray(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(1000000);
        }

        return array;
    }

    public static int maior(int[] a, int tamanho, int indice, int maior) {

        if (indice > tamanho - 1) {
            return maior;
        } else {
            if (indice == 0) {
                maior = a[indice];
            } else {
                if (a[indice] > maior) {
                    maior = a[indice];
                }
            }
            return maior(a, tamanho, indice + 1, maior);
        }
    }

    public static int menor(int[] a, int tamanho, int indice, int menor) {

        if (indice > tamanho - 1) {
            return menor;
        } else {
            if (indice == 0) {
                menor = a[indice];
            } else {
                if (a[indice] < menor) {
                    menor = a[indice];
                }
            }
            return menor(a, tamanho, indice + 1, menor);
        }
    }
}
