public class Triangulo implements FormaGeometrica{
    private float lado1;
    private float lado2;
    private float lado3;

    private float altura;

    public Triangulo(float lado1, float lado2, float lado3, float altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }
    public Triangulo(){}

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    @Override
    public float calcularPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public float calcularArea() {
        return (lado1 * altura) / 2;
    }
    public void getNomeForma() {
        System.out.println("\n      -Triangulo-");
    }
}
