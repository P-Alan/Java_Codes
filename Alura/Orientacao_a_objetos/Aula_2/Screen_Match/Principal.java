package Alura.Orientacao_a_objetos.Aula_2.Screen_Match;

import Alura.Orientacao_a_objetos.Aula_2.Screen_Match.Filmes.Filme;

public class Principal {
    public static void main(String[] args) {
        // Objeto de referência
        // Instanciar um objeto
        Filme meuFilme = new Filme();
        meuFilme.setNome("Kill Bill");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(180);
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações : " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(String.format("Média de avaliações : %.2f", meuFilme.obterMediaAvaliacoes()));
    }
}
