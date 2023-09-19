import java.util.Scanner;

/**
** Função :  recursão que escreve um método para determinar se uma string tem mais
vogais que consoantes
** Autor : Daniel Warella Pitsch
** Data : 09/09/2023
** Observações:
*/

public class ED2Lista1Questao13 {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        int vogais = contador(palavra);
        int consoantes = palavra.length() - vogais;

        if (vogais > consoantes) {
            System.out.println("A palavra tem mais vogais que o consoante.");
        } else {
            System.out.println("A palavra nao tem vogais mais que consoante.");
        }
        System.out.println("-Fim-");
    }

    public static boolean vogal(char palavra) {
        palavra = Character.toLowerCase(palavra);
        return palavra == 'a' || palavra == 'e' || palavra == 'i' || palavra == 'o' || palavra == 'u';
    }

    public static int contador(String str) {
        if (str.isEmpty()) {
            return 0;
        } else {
            char primeiro = str.charAt(0);
            int resultado = contador(str.substring(1));
            if (vogal(primeiro)) {
                return 1 + resultado;
            } else {
                return resultado;
            }
        }
    }
}
