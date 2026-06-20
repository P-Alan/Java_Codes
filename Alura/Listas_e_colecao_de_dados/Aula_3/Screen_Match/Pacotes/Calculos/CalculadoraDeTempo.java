package Alura.Listas_e_colecao_de_dados.Aula_3.Screen_Match.Pacotes.Calculos;

import Alura.Listas_e_colecao_de_dados.Aula_3.Screen_Match.Pacotes.Modelos.*;

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