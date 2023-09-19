import java.util.Scanner;

/**
** Função : Classe com método recursivo
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao15 {
	
	public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int um = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        int dois = sc.nextInt();

        System.out.printf("%-2d x %-2d = %-3d\n", um, dois, ED2Lista1Questao15_2.multiplica(um, dois));
        System.out.println("-Fim-");
    }

}
