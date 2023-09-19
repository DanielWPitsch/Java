
/**
** Função : Classe com método recursivo
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao15_2 {
	
	public static int multiplica(int a, int b) {
        if (a == 0 || b == 0) return 0;
        else if (b == 1) {
            return a;
        } else {
            return (a + multiplica(a, b - 1));
        }
    }
}
