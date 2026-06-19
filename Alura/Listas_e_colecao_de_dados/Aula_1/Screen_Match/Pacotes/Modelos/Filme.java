package Alura.Listas_e_colecao_de_dados.Aula_1.Screen_Match.Pacotes.Modelos;

import Alura.Listas_e_colecao_de_dados.Aula_1.Screen_Match.Pacotes.Calculos.Classificavel;

// Extends faz com que TODO filme seja um Titulo
public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public String getDiretor()
    {
        return diretor;
    }

    public void setDiretor(String diretor)
    {
        this.diretor = diretor;
    }

    @Override
    public void exibeFichaTecnica()
    {
        String ficha = """
                ==================================
                ===========|| FILME || ===========
                Nome: %s
                Ano de lançamento: %d
                Duração: %d minutos
                Diretor: %s
                ==================================
                """.formatted(getNome(), getAnoDeLancamento(), getDuracaoEmMinutos(), getDiretor());
        System.out.println(ficha);
    }

    @Override
    public int getClassificacao()
    {
        return (int) obterMediaAvaliacoes()/2;
    }

    @Override
    public String toString() {
        return "Filme : " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}