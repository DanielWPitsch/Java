/**
** Função : Mede tempo do bublesort com alguns casos de 10 a 1.000.000
** Autor : Daniel Warella Pitsch
** Data : 02/12/2023
** Observações: 
*/

import java.util.Random;
import java.util.Scanner;

public class ED2Lista2_questao01 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite a quantidade de elementos do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = gerarVetorAleatorio(tamanho);

        long start = System.currentTimeMillis();
        System.out.println("\nVetor original: \n" + vetorToString(vetor));

        int[] resultado = bubbleSort(vetor);

        System.out.println("\nVetor ordenado: \n" + vetorToString(resultado));

        System.out.println("\nQuantidade de if's realizados: " + qtdIfs);
        System.out.println("Quantidade de trocas realizadas: " + qtdTrocas);
        
        float elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo: " +elapsed+" milisegundos");
    }

    static int qtdIfs = 0;
    static int qtdTrocas = 0;

    public static int[] bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                qtdIfs++; // Conta a comparação
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    qtdTrocas++; // Conta a troca
                    trocou = true;
                }
                
            }
            // Se não houve troca, o vetor está ordenado
            if (!trocou) {
                break;
            }
        }

        return vetor;
    }


    public static String vetorToString(int[] vetor) {
        StringBuilder result = new StringBuilder("[");
        int quebra = 0;
        for (int i = 0; i < vetor.length; i++) {
        	
            result.append(vetor[i]);
            if (i < vetor.length - 1) {
                result.append(", ");
            }
            quebra++;
            if(quebra ==50) {
            	result.append("\n");
            	quebra=0;
            }
           
        }
        result.append("]");
        return result.toString();
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