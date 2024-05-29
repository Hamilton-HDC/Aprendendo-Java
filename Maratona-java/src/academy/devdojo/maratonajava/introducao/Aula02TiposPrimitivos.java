package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10; //Usados para números inteiros
        long bigNumber = (long) 155.23; // Aqui estamos forçando o tipo da variavel com o cast
        double wageDouble = 2000D; // Usados para números de ponto flutuante
        float wageFloat = 2500.0F; //Usados para números de ponto flutuante
        byte ageByte = -128; //Usado para números inteiros muito pequenos.
        short ageShort = 32000; //Usados para números inteiros
        boolean real = true; //Usado para valores verdadeiros ou falsos.
        boolean notReal = false; //Usado para valores verdadeiros ou falsos.
        char character = 'M';//O tipo primitivo char em Java é usado para representar um único caractere Unicode.
        // Isso inclui letras, dígitos, símbolos e caracteres especiais. O tipo char ocupa 16 bits (2 bytes)
        // e pode armazenar qualquer caractere UTF-16.

        String name = "Hamilton";
        System.out.println ("A idade é: "+ age);
        System.out.println (name);
    }
}
