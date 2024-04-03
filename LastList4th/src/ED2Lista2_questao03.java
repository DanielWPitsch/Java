/**
** Função : Mede tempo do Arrays.sort com alguns casos de 10.000 a 500.000.000
** Autor : Daniel Warella Pitsch
** Data : 02/12/2023
** Observações: 
*/

import java.util.Arrays;
import java.util.Random;

public class ED2Lista2_questao03 {
    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 1000000, 10000000, 100000000, 500000000};
        int i=0;

        for (int size : sizes) {
            int[] array = gerarVetorAleatorio(size);

            long startTime = System.currentTimeMillis();
            Arrays.sort(array);
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;

            System.out.println(sizes[i]+"= "+elapsedTime+" milissegundos");
            i++;
        }
    }
    public static int[] gerarVetorAleatorio(int tamanho) {
        Random random = new Random();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(1000); 
        }

        return vetor;
    }
}

    