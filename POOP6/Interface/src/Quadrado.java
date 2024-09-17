public class Quadrado implements FormaGeometrica{
    private float lado;

    public Quadrado() {}
    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public float calcularPerimetro() {
        return lado * 4;
    }

    public void getNomeForma() {
        System.out.println("\n      -Quadrado-");
    }
}
