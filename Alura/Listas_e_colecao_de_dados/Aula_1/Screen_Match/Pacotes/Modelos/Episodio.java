package Alura.Listas_e_colecao_de_dados.Aula_1.Screen_Match.Pacotes.Modelos;

import Alura.Listas_e_colecao_de_dados.Aula_1.Screen_Match.Pacotes.Calculos.Classificavel;

public class Episodio implements Classificavel{
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizacoes;

    public int getTotalDeVisualizacoes() 
    {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) 
    {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public Serie getSerie() 
    {
        return serie;
    }

    public void setSerie(Serie serie) 
    {
        this.serie = serie;
    }

    public int getClassificacao() 
    {
        if (totalDeVisualizacoes > 100)
        {
            return 4;
        } else {
            return 2;
        }
    }
}
