package app;

import java.awt.image.BufferedImage;

import static app.Operacoes.*;

public class Main {
    public static void main(String[] args) {
        BufferedImage imagem = Manipulando.abrirImagem("arara.jpeg");
        Manipulando.exibirImagem(imagem, brilhoAdd(imagem, 50), brilhoMtt(imagem, 1.5f));
        Manipulando.salvarImagem(negativo(imagem), "jpeg", "negativa");
    }
}