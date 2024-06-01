package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[]args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println( resultado );

        // Operadores logicos

        // Operador resto da soma %
        int resto = 21%7;
        System.out.println(resto);

        // Operador de igualdede

        // < >... <= >= .... == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 10;
        boolean isDezDiferentelDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte" + isDezMenorQueVinte );
        System.out.println("isDezMenorQueVinte" + isDezMaiorQueVinte );

        System.out.println("isDezIgualvinte" + isDezIgualVinte );
        System.out.println("isDezIgualDez" + isDezDiferentelDez);


    }

}


