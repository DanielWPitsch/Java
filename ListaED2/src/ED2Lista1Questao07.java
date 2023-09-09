
/**
** Função : contador de Nós recusivo
** Autor : Daniel Warella Pitsch
** Data : 08/09/2023
** Observações:
*/

public class ED2Lista1Questao07 {
	
	static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
	
	public static void main(String[] args) {
        No primeiro = new No(1);
        No segundo = new No(2);
        No terceiro = new No(3);

        primeiro.proximo = segundo;
        segundo.proximo = terceiro;

        int numeroDeNos = contadorNoh(primeiro);
        System.out.println("O número de nós na lista encadeada é: " + numeroDeNos);
    }
	
	public static int contadorNoh(No no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contadorNoh(no.proximo);
        }
    }
}
