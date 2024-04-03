package app;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Operacoes {
    public static BufferedImage bandaRed(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //System.out.println(red+" "+green+ " "+blue);
                Color novaCor = new Color(red, 0, 0);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage bandaBlue(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //System.out.println(red+" "+green+ " "+blue);
                Color novaCor = new Color(0, 0, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage bandaGreen(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //System.out.println(red+" "+green+ " "+blue);
                Color novaCor = new Color(0, green, 0);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage negativo(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //System.out.println(red+" "+green+ " "+blue);
                Color novaCor = new Color(255-red, 255-green, 255-blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage CinzaRed(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //System.out.println(red+" "+green+ " "+blue);
                Color novaCor = new Color(red, red, red);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage CinzaGreen(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //System.out.println(red+" "+green+ " "+blue);
                Color novaCor = new Color(green, green, green);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage CinzaBlue(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //System.out.println(red+" "+green+ " "+blue);
                Color novaCor = new Color(blue, blue, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage CinzaMedia(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                int media = (red+green+blue)/3;
                Color novaCor = new Color(media, media, media);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage binarizacao(BufferedImage imgEntrada, int limiar) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h); // 1byte, 1byte, 1byte
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int cores;
                int media = (red+green+blue)/3;
                // cores = media > limiar ? 255 : 0; // ternário
                if(media > limiar) {
                    cores = 0;
                }else{
                    cores = 255;
                }
                Color novaCor = new Color(cores, cores, cores);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage alteraTonalidade(BufferedImage imgEntrada, String canal, int alteracao) {

        //calistenia --->early return
        if(!canal.equalsIgnoreCase("red")
                && !canal.equalsIgnoreCase("green")
                && !canal.equalsIgnoreCase("blue")){
            throw new IllegalArgumentException("Canal inválido");
        }
        //evitar else, outra tecnica de calistenia

        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                if(canal.equals("red")) {
                    if(alteracao+red > 255){
                        red =255;
                    }else if(alteracao+red < 0){
                        red =0;
                    }else{
                        red = alteracao+red;
                    }
                }else if(canal.equals("blue")) {
                    if(alteracao+blue > 255){
                        blue =255;
                    }else if(alteracao+blue < 0){
                        blue =0;
                    }else{
                        blue = alteracao+blue;
                    }
                }else if(canal.equals("green")) {
                    if(alteracao+green > 255){
                        green =255;
                    }else if(alteracao+green < 0){
                        green =0;
                    }else{
                        green = alteracao+green;
                    }
                }
                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoAdd(BufferedImage imgEntrada, int alteracao) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h); // 1byte, 1byte, 1byte
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                if(alteracao+red > 255){
                    red =255;
                }else if(alteracao+red < 0){
                    red =0;
                }else{
                    red = alteracao+red;
                }

                if(alteracao+blue > 255){
                    blue =255;
                }else if(alteracao+blue < 0){
                    blue =0;
                }else{
                    blue = alteracao+blue;
                }

                if(alteracao+green > 255){
                    green =255;
                }else if(alteracao+green < 0){
                    green =0;
                }else{
                    green = alteracao+green;
                }

                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoMtt(BufferedImage imgEntrada, float alteracao) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h); // 1byte, 1byte, 1byte
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                if(alteracao * red > 255){
                    red = 255;
                }else if(alteracao * red < 0){
                    red = 0;
                }else{
                    red = (int) alteracao * red;
                }

                if(alteracao*blue > 255){
                    blue =255;
                }else if(alteracao*blue < 0){
                    blue =0;
                }else{
                    blue = (int) alteracao * blue;
                }

                if(alteracao*green > 255){
                    green =255;
                }else if(alteracao*green < 0){
                    green =0;
                }else{
                    green = (int) alteracao * green;
                }

                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage negativoY(BufferedImage imgEntrada, float alteracao) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h); // 1byte, 1byte, 1byte
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                if(alteracao*red > 255){
                    red =255;
                }else if(alteracao*red < 0){
                    red =0;
                }else{
                    red = (int) alteracao*red;
                }

                if(alteracao*blue > 255){
                    blue =255;
                }else if(alteracao*blue < 0){
                    blue =0;
                }else{
                    blue = (int) alteracao * green;
                }

                if(alteracao*green > 255){
                    green =255;
                }else if(alteracao*green < 0){
                    green =0;
                }else{
                    green = (int) alteracao * green;
                }

                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoAddY(BufferedImage imgEntrada, float alteracao) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h); // 1byte, 1byte, 1byte
                Color cor = new Color(rgb);

                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                double Y = (0.299 * red) + (0.587 * green) + (0.114 * blue);
                double I = (0.596 * red) - (0.274 * green) - (0.322 * blue);
                double Q = (0.211 * red) - (0.523 * green) + (0.312 * blue);

                if(alteracao + Y > 255){
                    Y =255;
                }else if(alteracao + Y < 0){
                    Y =0;
                }else{
                    Y = alteracao + Y;
                }

                if(alteracao + I > 255){
                    I = 255;
                }else if(alteracao + I < 0){
                    I = 0;
                }else{
                    I = alteracao + I;
                }

                if(alteracao + Q > 255){
                    Q = 255;
                }else if(alteracao + Q < 0){
                    Q = 0;
                }else{
                    Q = alteracao + Q;
                }

                red = (int) Y;
                green = (int) I;
                blue = (int) Q;

                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage brilhoMttY(BufferedImage imgEntrada, float alteracao) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        //nova imagem de largura e altura igual, mas com os pixels zerados

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imgEntrada.getRGB(w, h); // 1byte, 1byte, 1byte
                Color cor = new Color(rgb);

                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                double Y = (0.299 * red) + (0.587 * green) + (0.114 * blue);
                double I = (0.596 * red) - (0.274 * green) - (0.322 * blue);
                double Q = (0.211 * red) - (0.523 * green) + (0.312 * blue);

                if(alteracao * Y > 255){
                    Y =255;
                }else if(alteracao * Y < 0){
                    Y =0;
                }else{
                    Y = alteracao * Y;
                }

                if(alteracao * I > 255){
                    I = 255;
                }else if(alteracao * I < 0){
                    I = 0;
                }else{
                    I = alteracao * I;
                }

                if(alteracao * Q > 255){
                    Q = 255;
                }else if(alteracao * Q < 0){
                    Q = 0;
                }else{
                    Q = alteracao * Q;
                }

                red = (int) ((1.000 * Y) + (0.956 * I) + (0.621 * Q));
                green = (int) ((1.000 * Y) - (0.272 * I) - (0.647 * Q));
                blue = (int) ((1.000 * Y) - (1.106 * I) + (1.703 * Q));

                if(red > 255){
                    red = 255;
                }else if(red < 0){
                    red = 0;
                }

                if(green > 255){
                    green = 255;
                }else if(green < 0){
                    green = 0;
                }

                if(blue > 255){
                    blue = 255;
                }else if(blue < 0){
                    blue = 0;
                }

                //System.out.println(red);

                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
}

//seleciona linhas, clica com botao direito, refactor, extract method
//shift f6, para mudar todas palavras com mesmo nome