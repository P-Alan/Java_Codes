package Alura.Orientacao_a_objetos.Aula_3.Screen_Match.Pacotes.Modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // Método de exibição
    public int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    public String getNome()
    {
        return nome;
    }

    public int getAnoDeLancamento()
    {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos()
    {
        return duracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano()
    {
        return incluidoNoPlano;
    }

    // Método de inserção
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(Boolean incluidoNoPlano)
    {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento)
    {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos)
    {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Método
    public void exibeFichaTecnica()
    {
        String ficha = """
                ==================================
                Nome: %s
                Ano de lançamento: %d
                Duração: %d minutos
                ==================================
                """.formatted(nome, anoDeLancamento, duracaoEmMinutos);
        System.out.println(ficha);
    }

    // Método
    public void avalia(double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // Método
    public double obterMediaAvaliacoes()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
