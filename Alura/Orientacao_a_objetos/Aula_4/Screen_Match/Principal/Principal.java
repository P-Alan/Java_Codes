package Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Principal;

import Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Pacotes.Modelos.Episodio;
import Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Pacotes.Modelos.Filme;
import Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Pacotes.Modelos.Serie;
// import Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Pacotes.Calculos.CalculadoraDeTempo;
import Alura.Orientacao_a_objetos.Aula_4.Screen_Match.Pacotes.Calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        // Objeto de referência
        // Instanciar um objeto
        Filme Kill_Bill = new Filme();
        Kill_Bill.setNome("Kill Bill");
        Kill_Bill.setAnoDeLancamento(1999);
        Kill_Bill.setDuracaoEmMinutos(180);
        Kill_Bill.setDiretor("Quentin Tarantino");
        
        
        Kill_Bill.exibeFichaTecnica();
        Kill_Bill.avalia(8);
        Kill_Bill.avalia(5);
        Kill_Bill.avalia(10);

        // System.out.println("Total de avaliações : " + Kill_Bill.getTotalDeAvaliacoes());
        // System.out.println(String.format("Média de avaliações : %.2f\n\n", Kill_Bill.obterMediaAvaliacoes()));
    
        Filme Avatar = new Filme();
        Avatar.setNome("Avatar");
        Avatar.setAnoDeLancamento(2024);
        Avatar.setDuracaoEmMinutos(200);
        Avatar.setDiretor("James Cameron");

        Avatar.exibeFichaTecnica();

    
        Serie Jojo = new Serie();
        Jojo.setNome("JoJo");
        Jojo.setAnoDeLancamento(1990);
        Jojo.setTemporadas(9);
        Jojo.setEpisodiosPorTemporada(40);
        Jojo.setMinutosPorEpisodio(20);
        
        System.out.println("Duração para maratonar : " + Jojo.getDuracaoEmMinutos());
        Jojo.exibeFichaTecnica();

        // CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        // calculadora.inclui(Kill_Bill);
        // calculadora.inclui(Avatar);
        // calculadora.inclui(Jojo);
        // System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        // filtro.filtra(Kill_Bill);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Jojo);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
