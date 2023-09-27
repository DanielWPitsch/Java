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
        System.out.println("Informe o operando: ");
		
		Noh_10 three = new OperandoNoh_10(3);
        Noh_10 four = new OperandoNoh_10(4);
        Noh_10 plus = new OperadorNoh_10('+', three, four);
        Noh_10 two = new OperandoNoh_10(2);
        Noh_10 times = new OperadorNoh_10('*', plus, two);

        double result = times.evaluate();
        System.out.println("Resultado da expressão: " + result);
    }

}
