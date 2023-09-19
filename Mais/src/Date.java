import java.time.LocalDate;

/* O framework JodaTime, que tem um conjunto de funcionalidades 
 * para a manipulação de datas muito maior que a API do Java até a versão 7.
 * A classe principal dessa nova especificação é a classe java.time.LocalDate
 * que tem a mesma função que a antiga classe java.util.Date,
 * mas com muito mais funcionalidades implementadas.
 */

public class Date {
	public static void main(String args[]) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
		System.out.println("Mes: " + localDate.getMonthValue());
		System.out.println("Mes: " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear());
	}

}
