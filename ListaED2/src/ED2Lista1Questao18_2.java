
/**
** Função : recursivamente testa se uma string é ou não um palíndromo
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao18_2 {

	static boolean isPalRec(String str, int s, int e)
    {
        if (s == e)
            return true;

        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }
    static boolean isPalindrome(String str)
    {
        int n = str.length();

        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }
    
}
