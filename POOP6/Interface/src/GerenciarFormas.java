import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerenciarFormas {
    public static void main(String[] args) {

        List<FormaGeometrica> formas = new ArrayList<>(Arrays.asList(
                new Circulo(5),
                new Retangulo(5, 10),
                new Triangulo(3, 4, 5, 5),
                new Quadrado(4)
        ));

        formas.forEach(f -> imprimirForma(f));
        System.out.printf("\nFim!");
    }
    void cadastrarFormaGeometrica(){
        System.out.println("cadastro");
    }
    static void imprimirForma(FormaGeometrica f){
        f.getNomeForma();
        System.out.println("imprimir area: "+ f.calcularArea());
        System.out.println("imprimir perimetro: "+ f.calcularPerimetro());
    }
}