import java.util.Scanner;

/**
** Função : recursivamente testa se uma string é ou não um palíndromo
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao18 {
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String str = sc.nextLine();


        ED2Lista1Questao18_2 Palindromo = new ED2Lista1Questao18_22();
        if (Palindromo.isPalindrome(str))
            System.out.println(str + " é palíndromo");
        else
            System.out.println(str + " não é palíndromo");
    }
	
}
