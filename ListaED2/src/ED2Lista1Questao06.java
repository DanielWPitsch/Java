import java.util.Scanner;

/**
** Função : Função recursiva que inverte String
** Autor : Daniel Warella Pitsch
** Data : 08/09/2023
** Observações:
*/

public class ED2Lista1Questao06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("informe a string: ");
		String original = sc.nextLine();

        String inverso = inverterString(original);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + inverso);
        System.out.println("-Fim-");
    }
	
	public static String inverterString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + inverterString(str.substring(0, str.length() - 1));
        }
    }
}
