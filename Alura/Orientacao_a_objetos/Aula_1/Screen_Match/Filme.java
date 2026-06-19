package Alura.Orientacao_a_objetos.Aula_1.Screen_Match;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    // Método
    void exibeFichaTecnica()
    {
        String ficha = """
                ==================================
                Nome do filme: %s
                Ano de lançamento: %d
                Duração: %d
                ==================================
                """.formatted(nome, anoDeLancamento, duracaoEmMinutos);
        System.out.println(ficha);
    }

    // Método
    void avalia(double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // Método
    double obterMediaAvaliacoes()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}