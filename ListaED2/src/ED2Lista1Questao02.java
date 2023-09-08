/**
** Função : Soma de elementos de array recursiva
** Autor : Daniel Warella Pitsch
** Data : 08/09/2023
** Observações:
*/



public class ED2Lista1Questao02 {
	
	public static void main (String args[]) {
		double[] array1 = {2.2, 333.1, 45.2, 11.2};
		int tamanho = array1.length;
		double soma = soma_array(array1, tamanho);
		
		System.out.println("A soma do array deu: "+soma);
		System.out.println("-Fim-");
	
	}
	
	public static double soma_array(double[] a, int t) {
		if(t-1 == 0) {
			return a[0];
		}else {
			return a[t-1] + soma_array(a, t-1);
		}
		
	}
	
}
