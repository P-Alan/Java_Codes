package Alura.Orientacao_a_objetos.Aula_1.Spotfy;

public class Principal {
    public static void main(String[] args) {
        Musica jane = new Musica();
        jane.nome = "Jane";
        jane.anoDeLancamento = 2019;
        jane.artista = "The long faces";
        jane.avaliacao = 144;
        jane.numeroDeAvaliacoes = 30;
        jane.media = jane.avaliacao / jane.numeroDeAvaliacoes;

        jane.exibeFichaTecnica();
        jane.pedeMedia();
        jane.exibeFichaTecnica();
    }
}
