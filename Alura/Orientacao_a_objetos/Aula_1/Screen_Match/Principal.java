package Alura.Orientacao_a_objetos.Aula_1.Screen_Match;

public class Principal {
    public static void main(String[] args) {
        // Objeto de referência
        // Instanciar um objeto
        Filme meuFilme = new Filme();
        meuFilme.nome = "Kill Bill";
        meuFilme.anoDeLancamento = 1999;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.somaDasAvaliacoes = 0;
        meuFilme.totalDeAvaliacoes = 0;
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.obterMediaAvaliacoes());
    }
}
