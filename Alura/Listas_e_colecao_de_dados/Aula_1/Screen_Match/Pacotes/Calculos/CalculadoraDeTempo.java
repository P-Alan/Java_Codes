package Alura.Listas_e_colecao_de_dados.Aula_1.Screen_Match.Pacotes.Calculos;

import Alura.Listas_e_colecao_de_dados.Aula_1.Screen_Match.Pacotes.Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo)
    {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}