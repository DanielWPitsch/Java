package Arvores;

import java.util.Scanner;

/**
** Função : Expressões matemáticas com árvores
** Autor : Daniel Warella Pitsch
** Data : 26/09/2023
** Observações:
*/

public class ED2Lista2Questao10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro operando: ");
        double numero1 = sc.nextDouble();
        Noh_10 n1 = new OperandoNoh_10(numero1);
        sc.nextLine();
        
        System.out.println("Informe o operador: ");
        char op = sc.nextLine().charAt(0);
        
        System.out.println("Informe o primeiro operando: ");
        double numero2 = sc.nextDouble();
        Noh_10 n2 = new OperandoNoh_10(numero2);
        
        Noh_10 operacao = new OperadorNoh_10(op, n1, n2);

        double resultado = operacao.evaluate();
        System.out.println("Resultado da expressão: " + resultado);
    }

}
