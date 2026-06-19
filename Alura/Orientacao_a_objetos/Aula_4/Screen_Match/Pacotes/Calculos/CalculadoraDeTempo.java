package Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Pacotes.Calculos;

import Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Pacotes.Modelos.Titulo;

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