import java.util.Scanner;

/**
** Função : Método recursivo rápido para inverter uma lista encadeada
** Autor : Daniel Warella Pitsch
** Data : 09/09/2023
** Observações:
*/

public class ED2Lista1Questao08 {
	
	public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        Scanner sc = new Scanner(System.in);
        int menu;
        int dado;
        do {
            System.out.println("Digite:\n 1 - Para adicionar elemento a lista\n 2 - Para calcular a quantidade de nos da lista\nou digite qualquer tecla para sair:");
            menu = sc.nextInt();
            if(menu == 1){
                System.out.println("Digite algo para ser inserido a celula:");
                dado = sc.nextInt();
                lista.adiciona(dado);
            } else if (menu == 2) {
                System.out.println("A quantidade de nos sao: "+lista.contador());
                System.out.println(lista.toString());
            }else {
                menu = 0;
            }
        }while (menu != 0);
        System.out.println("-Fim-");
    }
}
