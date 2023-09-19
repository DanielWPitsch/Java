
/**
** Função : Com recursividade verifica se um array de inteiros contém um
inteiro que é a soma de dois inteiros que aparecem antes no array ,
** Autor : Daniel Warella Pitsch
** Data : 09/09/2023
** Observações:
*/

public class ED2Lista1Questao12 {
	
	public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5};
        int contador = verifica(array, array.length, 0, 0);
        System.out.println("-Fim-");
    }

    public static int verifica(int array[], int tamanho, int indice, int contador) {
        if (indice > tamanho - 1) {
            return contador;
        }else{
            for (int j = 0; j < indice; j++) {
                for (int k = j; k < indice; k++) {
                    if (array[j]+array[k] == array[indice]) {
                        System.out.println(","+array[j]+","+array[k]+","+array[indice]);
                    }
                }
            }
            return verifica(array, tamanho, indice+1, contador);
        }
    }
}
