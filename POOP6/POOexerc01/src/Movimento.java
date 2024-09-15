import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Movimento {
    public TipoMovimentoEnum tipo;
    private LocalDate dataMovimentacao;
    private LocalTime horaMovimentacao;
    private double valor;

    public Movimento(){}

    public Movimento(TipoMovimentoEnum tipo, double valor){
        this.tipo = tipo;
        this.dataMovimentacao = LocalDate.now();
        this.horaMovimentacao = LocalTime.now();
        this.valor = valor;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = horaMovimentacao.format(formatter);
        return "Movimentação:\n" +
                "Tipo=" + tipo + "\n" +
                "Data=" + dataMovimentacao.toString() + "\n" +
                "Hora=" + hora + "\n" +
                "Valor=" + valor +
                "\n";
    }

}
