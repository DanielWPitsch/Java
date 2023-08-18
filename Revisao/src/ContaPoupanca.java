

import java.util.Date;

public class ContaPoupanca extends Conta {
    private double rendimentos;

    public ContaPoupanca(String idConta, double saldo, String tipoPessoa, int operacao, Date dataMovimentacao, String senha) {
        super(idConta, saldo, tipoPessoa, operacao, dataMovimentacao, senha);
    }

    public double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }

    public void atualizarRendimentos() {
        
    }
}
