package Alura.aula_2;

public class ScreenMatch {
    public static void main(String[] args) {
        System.out.println("\nEsse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println(String.format("Ano de lançamento: %d", anoDeLancamento));
        
        // boolean incluidoNoPlano = true;
        // Variável do tipo booleana
        
        double notaDoFilme = 8.1;
        System.out.println("Nota no Match: " + notaDoFilme);

        double media = (9.8 + 6.3 + notaDoFilme) / 3;
        System.out.println(String.format("Média global: %.2f", media));

        // String sinopse = "Filme de ação com galã dos anos 80 !!";
        // Uma das formas de declarar String

        String sinopse = """
                Descrição:
                Filme de ação com galã dos anos 80
                Também tem aviões
                Ano de lançamento: %d
                """.formatted(anoDeLancamento);
        // String formatada

        System.out.println(sinopse);

        int estrelas;
        estrelas = (int) (media / 2);
        // Converter o double para int
        // Também há o casting implícito, que é quando o "(int)" não precisa ser colocado por que a variável de origem é menor que a variável destino

        System.out.println(String.format("Estrelas: %d", estrelas));
    }
}
