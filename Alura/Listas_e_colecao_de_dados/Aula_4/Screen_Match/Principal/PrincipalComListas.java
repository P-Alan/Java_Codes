package Alura.Listas_e_colecao_de_dados.Aula_4.Screen_Match.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Alura.Listas_e_colecao_de_dados.Aula_4.Screen_Match.Pacotes.Modelos.Titulo;
import Alura.Listas_e_colecao_de_dados.Aula_4.Screen_Match.Pacotes.Modelos.Filme;
import Alura.Listas_e_colecao_de_dados.Aula_4.Screen_Match.Pacotes.Modelos.Serie;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme Kill_Bill = new Filme("Kill Bill", 1999);
        Kill_Bill.avalia(9);
        Filme Avatar = new Filme("Avatar", 2023);
        Avatar.avalia(10);
        Filme Dogville = new Filme("Dogville", 2003);
        Dogville.avalia(10);
        Serie Jojo = new Serie("Jojo", 1990);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(Dogville);
        lista.add(Avatar);
        lista.add(Kill_Bill);
        lista.add(Jojo);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificaçao : " + filme.getClassificacao());
            }
            
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Zendaya");
        buscaPorArtistas.add("Cellbit");
        buscaPorArtistas.add("Joaquin Phoenix");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenaçao (Alfabetica): " + buscaPorArtistas);

        Collections.sort(lista);
        System.out.println("Lista de filme ordenada (Alfabetica): " + lista);
    
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Depois da ordenação (Ano) : " + lista);
    }

}