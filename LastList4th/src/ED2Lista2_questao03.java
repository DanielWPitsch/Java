/**
** Função :
** Autor :
** Data :
** Observações:
*/

import java.util.Arrays;

public class ED2Lista2_questao03 {

    public static void main(String[] args) {
        // Defina os tamanhos dos vetores para os experimentos
        int[] tamanhos = {100000, 1000000, 10000000, 100000000, 500000000};

        // Execute os experimentos para cada tamanho do vetor
        for (int tamanho : tamanhos) {
            int[] vetor = geraVetorAleatorio(tamanho);

            // Registre o tempo de início
            long startTime = System.nanoTime();

            // Execute o algoritmo de ordenação (por exemplo, Quicksort)
            quicksort(vetor, 0, vetor.length - 1);

            // Registre o tempo de término
            long endTime = System.nanoTime();

            // Calcule a duração em milissegundos
            long durationInMillis = (endTime - startTime) / 1000000;

            // Exiba os resultados
            System.out.println("Tamanho do vetor: " + tamanho + " - Tempo de execução: " + durationInMillis + " ms");
        }
    }

    static int[] geraVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * tamanho);
        }
        return vetor;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}