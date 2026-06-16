package Alura.aula_2.Desafios;

public class DesafioConversao {
    public static void main(String[] args) {
        double celsius = 32;
        double fahrenheit = (celsius * 1.8) + 32;
        int fahrenheitInt = (int) fahrenheit;

        String texto = """
                \nTemperatura em Celsius: %.2f
                Temperatura em Fahrenheit: %.2f
                Temperatura em Fahrenheit inteiros: %d
                """.formatted(celsius, fahrenheit, fahrenheitInt);
        System.out.println(texto);
    }
}
