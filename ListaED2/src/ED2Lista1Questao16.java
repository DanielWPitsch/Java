import java.util.Random;
import java.util.Scanner;

/**
** Função : soma dos N primeiros inteiros positivos
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao16 {

	public static void main(String[] args) {
        System.out.printf("Digite o tamanho do array:");
        Scanner tecla = new Scanner(System.in);
        int tamanho = tecla.nextInt();
        int[] array = gerarArray(tamanho);

        int resultado = Soma(array, 0, 0);

        System.out.println("O resultado foi:"+ resultado);
        System.out.println("-Fim-");
    }
    public static int[] gerarArray(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
    public static int Soma(int[] array, int indice, int somaParcial) {
        if (indice == array.length) {
            return somaParcial;
        } else {
            return Soma(array, indice + 1, (int) (somaParcial + array[indice]));
        }
    }
}
