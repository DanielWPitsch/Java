import java.util.ArrayList;
import java.util.Scanner;

public class Mon1 {
	public static void main(String args[]) {
		
		//Entrada e saida
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = sc.next();
	
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();
	
		//if e else
		if(idade < 18) {
			System.out.println("Você é de menor!");
		}else {
			System.out.println("Você é de maior!");
		}
		
		//switch + while
		int opcao =0;
		while(opcao != 3){
			System.out.println("Digite: "
					+ "\n1-Domingo"
					+ "\n2-Segunda"
					+ "\n3-Sair");
			opcao = sc.nextInt();
			
			switch(opcao){
				case 1:
					System.out.println("Domingo!");
					break;
				case 2:
					System.out.println("Segunda!");
					break;
				case 3:
					System.out.println("Saindo...!");
					break;
				default:
					System.out.println("Opcão inválida!");
			}
		}
		
		//for + vetores + Matriz
		
		int vetor [] = new int[3];
		
		int k=5;
		for (int i=0; i<3; i++) {
			vetor[i] = k;
			System.out.println(vetor[i]);
			k = k+2;
		}
		
		int matriz [][] = new int [2][2];
		
		for (int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.println("informe matriz["+linha+"]["+coluna+"]");
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		for (int linha=0; linha<2; linha++) {
			System.out.print("| ");
			for(int coluna=0; coluna<2; coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
			}
			System.out.println("|");
		}
		
		
		//Arraylist
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(87);
		array.add(121);
		array.add(8);
		
		int tamanho = array.size();
		for (int i=0; i<tamanho; i++) {
			System.out.println(array.get(i));
		}
		
		
		System.out.println("-Fim-");
	}

}
