import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
	public static void main(String args[]) {
		
		ArrayList<String> nome = new ArrayList(); 
		Scanner sc = new Scanner(System.in);
		String n = new String();
		
		System.out.println("Informe seu nome: ");
		n = sc.nextLine();
		nome.add(n);
		nome.add(1, "eu");
		int tamanho = nome.size();
		//for (int i=0; i<tamanho; i++) {
		 //     System.out.printf("Posição %d- %s\n", i, nome.get(i));
		//}
		for(String b: nome) {
			System.out.println(b);
		}
		
	}

}
