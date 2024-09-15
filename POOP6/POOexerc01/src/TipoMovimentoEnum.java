public enum TipoMovimentoEnum {
    SAQUE(1),
    DEPOSITO(2),
    TRANSFERENCIA(3);
    private int tipo;

    TipoMovimentoEnum(int tipo){
        this.tipo = tipo;
    }
}
