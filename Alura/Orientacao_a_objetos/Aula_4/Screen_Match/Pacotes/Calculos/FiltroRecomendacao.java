package Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Pacotes.Calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel)
    {
        if (classificavel.getClassificacao() >= 4)
        {
            System.out.println("Está entre os preferidos do momento !!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado.");
        } else {
            System.out.println("Coloque na sua lista para ver depois.");
        }
    }
}
