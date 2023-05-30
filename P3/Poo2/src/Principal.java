import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Algoritmos alg = new Algoritmos();
		
		System.out.println("Digite a nota: ");
		alg.setNota1(sc.nextDouble());
		
		System.out.println("Digite a nota: ");
		alg.setNota2(sc.nextDouble());
		
		System.out.println("Digite a nota: ");
		alg.setNota3(sc.nextDouble());
		
		System.out.println("Sua media em Algoritmos foi: "+alg.media(alg.getNota1(),alg.getNota2(), alg.getNota3()));
		
		Matematica mat = new Matematica();
		
		System.out.println("Digite a nota: ");
		mat.setNota1(sc.nextDouble());
		
		System.out.println("Digite a nota: ");
		mat.setNota2(sc.nextDouble());
		
		System.out.println("Digite a nota: ");
		mat.setNota3(sc.nextDouble());
		
		System.out.println("Digite a nota: ");
		mat.setNota4(sc.nextDouble());
		
		System.out.println("Sua media em Matematica foi: "+mat.media(mat.getNota1(), mat.getNota2(), mat.getNota3(), mat.getNota4()));
		
	}

}
