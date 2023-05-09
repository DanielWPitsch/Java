import java.sql.Date;
import java.time.*;
import java.util.Scanner;

public class Veiculo {
	
	String modelo;
	int ano;
	//Date ano;
	double peso;
	

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/*public Date getAno() {
		return ano;
	}
	public void setAno(Date ano) {
		this.ano = ano;
	}*/
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public static void main(String args[]) {
		Veiculo carro1 = new Veiculo();
		//LocalDate data = new LocalDate(0, 0, 0);
		
		//carro1.setModelo("celta");
		//carro1.setPeso(900);
		//carro1.setAno(2020);	
		//carro1.setPeso(900);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o modelo: ");
		String model = sc.nextLine();
		carro1.setModelo(model);
		
		System.out.println("Digite o ano: ");
		int ano = sc.nextInt();
		carro1.setAno(ano);
		
		System.out.println("Digite o peso do carro: ");
		double peso = sc.nextDouble();
		carro1.setPeso(peso);
		
		System.out.println("O modelo é "+carro1.getModelo()+" o seu ano eh "+carro1.getAno()+" e seu peso "+carro1.getPeso());
		
	}
}

