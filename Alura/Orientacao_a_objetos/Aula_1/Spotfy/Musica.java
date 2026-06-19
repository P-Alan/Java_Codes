package Alura.Orientacao_a_objetos.Aula_1.Spotfy;

import java.util.Scanner;

public class Musica {
    String nome;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    double numeroDeAvaliacoes;
    Scanner leitor = new Scanner(System.in);
    double media;
    double nota;
    String menu;

    void exibeFichaTecnica() 
    {
        menu = """
                _-_-_-_-_-_-_-_-_-_-_-_-_
                Música : %s
                Lançamento : %d
                Artista : %s
                Nota : %.2f
                _-_-_-_-_-_-_-_-_-_-_-_-_
                """.formatted(nome, anoDeLancamento, artista, media);
        System.out.println(menu);
    }

    double calculaMedia()
        {
            avaliacao += nota;
            numeroDeAvaliacoes++;
            media = avaliacao / numeroDeAvaliacoes;

            return media;
        }

    void pedeMedia()
    {
        System.out.println(String.format("Que nota você dá para %s :", nome));
        nota = leitor.nextDouble();
        calculaMedia();
        
    }

    
}
