package Arvores;

class OperadorNoh_10 extends Noh_10{
	
	private char operador;
    private Noh_10 esquerda;
    private Noh_10 direita;

    public OperadorNoh_10(char operador, Noh_10 esquerda, Noh_10 direita) {
        this.operador = operador;
        this.esquerda = esquerda;
        this.direita = direita;
    }

	@Override
	double evaluate() {
		// TODO Auto-generated method stub
		double esquerdaValor = esquerda.evaluate();
        double direitaValor = direita.evaluate();

        switch (operador) {
            case '+':
                return esquerdaValor + direitaValor;
            case '-':
                return esquerdaValor - direitaValor;
            case '*':
                return esquerdaValor * direitaValor;
            case '/':
                if (direitaValor == 0) {
                    throw new ArithmeticException("Erro de divisão por zero");
                }
                return esquerdaValor / direitaValor;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
	}
	
	
}
