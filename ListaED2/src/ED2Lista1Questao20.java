
/**
** Função : função recursiva para calcular o valor aproximado do número , somando a
série: 1+ 1/1! + 1/2!...
** Autor : Daniel Warella Pitsch
** Data : 10/09/2023
** Observações:
*/

public class ED2Lista1Questao20 {
	
	public static double fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
    public static double calcularE(int n, double precisao) {
        double termo = 1 / fatorial(n);
        if (termo < precisao) {
            return termo;
        }
        return termo + calcularE(n + 1, precisao);
    }
    public static void main(String[] args) {
        double precisao = 1.0e-8;
        double e = calcularE(0, precisao);
        String res = String.format("%.6f", e);
        System.out.println("\nO valor aproximado do número de Euler(e) é: " + res);
    }
}
