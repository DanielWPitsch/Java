import java.util.Date;

//package bancopotencia;

public class ContaCorrente extends Conta{
    private double limite = 500;
    private double taxa = 0.10;
    private double SaldoLimite;

    public ContaCorrente(double limite, double taxa, double SaldoLimite, String idConta, double saldo, String tipoPessoa, int operacao, Date dataMovimentacao, String senha){
    	super(idConta, saldo, tipoPessoa, operacao, dataMovimentacao, senha);
        //super(TipoPessoa, Saldo, senha);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldoLimite() {
        return SaldoLimite;
    }

    public void setSaldoLimite(double Saldo, double limite) {
        this.SaldoLimite = Saldo + limite;
    }
    public Boolean sacar(double valor, double saldo) {
        if (valor <= 0 && getSaldoLimite() < valor) return false;
        saldo -= valor + taxa;
        setSaldo(saldo);
        return true;
    }
    public Boolean depositar(Double valor, double saldo) {
        if (valor <= 0) return false;
        saldo += (valor - taxa);
        setSaldo(saldo);
        return true;
    }
}
