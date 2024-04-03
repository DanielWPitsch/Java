import java.util.Random;
import java.util.Scanner;

/**
** Função : Mede tempo do quicksort com alguns casos de 10 a 1.000.000
** Autor : Daniel Warella Pitsch
** Data : 02/12/2023
** Observações: 
*/

import java.util.Scanner;

public class ED2Lista2_questao02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        geraVetorRandom(vetor, tamanho);

        System.out.println("\nO vetor gerado pelo computador é:");
        exibeVetorInt(vetor, tamanho);

        //System.out.println("\nIteracoes\n");
        //QL();
        long start = System.currentTimeMillis();
        quicksort(vetor, 0, tamanho - 1);

        System.out.println("\n\nVetor Ordenado:");
        exibeVetorInt(vetor, tamanho);
        float elapsed = System.currentTimeMillis() - start;
        System.out.println("\n\nTempo: " +elapsed+" milissegundos");

        scanner.close();
    }

    static void geraVetorRandom(int vet[], int n) {
        for (int i = 0; i < n; ++i) {
            int valor = 1 + random(n - 1);
            vet[i] = valor;
        }
    }

    static void exibeVetorInt(int v[], int n) {
        for (int t = 0; t < n; t++)
            System.out.printf("%-3d ", v[t]);
    }

    static int random(int n) {
        return (int) (Math.random() * n + 1);
    }

    static void mostraElementos(int array[], int tamanho) {
        exibeSubVetor(array, 0, tamanho - 1);
    }

    static void exibeSubVetor(int array[], int primeiro, int ultimo) {
        for (int i = 0; i < primeiro; i++)
            System.out.print("   ");
        for (int i = primeiro; i <= ultimo; i++)
            System.out.print(" " + array[i]);
        System.out.println();
    }

    static void quicksort(int v[], int primeiro, int ultimo) {
        int i, j;
        int m, meio, aux;

        i = primeiro;
        j = ultimo;
        meio = (int) (i + j) / 2;
        m = v[meio];

        do {
            while (v[i] < m)
                i++;
            while (v[j] > m)
                j--;
            if (i <= j) {
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i++;
                j--;
            }
            //mostraElementos(v, ultimo + 1);
        } while (i <= j);
        //mostraElementos(v, ultimo + 1);
        if (primeiro < j)
            quicksort(v, primeiro, j);
        if (ultimo > i)
            quicksort(v, i, ultimo);
    }

    static void QL() {
        System.out.println();
    }
}