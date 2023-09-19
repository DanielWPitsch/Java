import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

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
		
		//Classe Instant
		/*mostrando como fazer a comparação de instante na API de datas do Java
		*/
	
		Instant iInicial = Instant.now();
		try {
		       Thread.sleep(1000);
		} catch (InterruptedException e) {
		       e.printStackTrace();
		}
		
		Instant iFinal = Instant.now();
		Duration duracao = Duration.between(iInicial, iFinal);

		System.out.println("Duração em nanos segundos: " + duracao.toNanos());
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		System.out.println("Duração em horas: " + duracao.toHours());
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		System.out.println("Duração em dias: " + duracao.toDays());
		
		//comparação entre datas
		System.out.println("\n\n-Comparação-\n");
		LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);
		LocalDate localDateNovo = LocalDate.of(2015, 3,5);

		System.out.println(localDateAntigo.isAfter(localDateNovo));
		System.out.println(localDateAntigo.isBefore(localDateNovo));
		System.out.println(localDateAntigo.isEqual(localDateNovo));

		Period periodo = Period.between(localDateAntigo, localDateNovo);
		System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");
		System.out.println("Apenas meses: " + periodo.toTotalMonths());
		
		
	}

}
