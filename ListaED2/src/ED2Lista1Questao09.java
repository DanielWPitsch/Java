import java.util.Scanner;

/**
** Função : mostra todos e quantos anagramas uma dada palavra tem
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao09 {
	static int contador = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Permutações:");
        int quantidade = generatePermutations(input.toCharArray(), 0);
        System.out.println("A quantidade de permutações é: "+ quantidade);
        System.out.println("-Fim-");
    }

    public static int generatePermutations(char[] array, int indice) {
        if (indice == array.length - 1) {
            System.out.println(new String(array));
            contador++;
        } else {
            for (int i = indice; i < array.length; i++) {
                troca(array, indice, i);
                generatePermutations(array, indice + 1);
                troca(array, indice, i);
            }
        }
        return contador;
    }

    public static void troca(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
