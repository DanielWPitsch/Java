import java.util.Scanner;

public class Matriz {
	public static void main(String args[]) {
		
		int[][] matriz = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.println("Digite o elemento ["+(i+1)+"]["+(j+1)+"]");
				matriz[i][j]= sc.nextInt();
			}
			
		}
		
		for(int i=0;i<3;i++) {
			System.out.print("|");
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("|");
		}
	}
}
