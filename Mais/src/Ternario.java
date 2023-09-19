
public class Ternario {
	public static void main(String args[]) {
		int numeroDias = 7;
		System.out.println((numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");
		int x=1, y=2, z=3;
		String maior = (x > y ? "x é maior " : (z > y ? "z é maior " : "y é maior "));
		System.out.println(maior);
	}	
}
