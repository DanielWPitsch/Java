public class Circulo implements FormaGeometrica{
    private float raio;

    public Circulo() {}
    public Circulo(float raio) {
        this.raio = raio;
    }
    public float getRaio() {
        return raio;
    }
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }

    @Override
    public void getNomeForma() {
        System.out.println("\n      -Circulo-");
    }
}
