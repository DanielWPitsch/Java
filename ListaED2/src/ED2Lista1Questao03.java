
/**
** Função : Inverte os elementos de um array de forma recursiva
** Autor : Daniel Warella Pitsch
** Data : 08/09/2023
** Observações:
*/

public class ED2Lista1Questao03 {
	
	public static void main (String args[]) {
		int[] array = {12, 33, 232, 41, 55};
		
		System.out.println("Array normal:");
        for (int n : array) {
            System.out.print(n + " ");
        }
        
        inverte(array, 0, array.length-1);

        System.out.println("\nArray invertido:");
        for (int n : array) {
            System.out.print(n + " ");
        }
		
		System.out.println("\n-Fim-");
	}
	
	public static void inverte(int[] a, int primeiro, int ultimo) {
        if (primeiro < ultimo) {
            int auxiliar = a[primeiro];
            a[primeiro] = a[ultimo];
            a[ultimo] = auxiliar; 
            inverte(a, primeiro+1, ultimo-1);
        }
    }
}
