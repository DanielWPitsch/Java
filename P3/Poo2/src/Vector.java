import java.util.Scanner;

public class Vector {
	public static void main(String args[]) {
		
		int[] array = new int[5];
		int[] arrayB = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite o "+(i+1)+"º numero:");
			array[i] = sc.nextInt();
			arrayB[i] = array[i] * array[i];
			System.out.println("A: "+array[i]+" e B: "+arrayB[i]+"\n");
		}
		System.out.println("-Fim-");
	}
}
