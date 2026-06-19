package Alura.Orientacao_a_objetos.Aula_3.Screen_Match.Pacotes.Modelos;

// Extends faz com que TODO filme seja um Titulo
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor()
    {
        return diretor;
    }

    public void setDiretor(String diretor)
    {
        this.diretor = diretor;
    }

    @Override
    public void exibeFichaTecnica()
    {
        String ficha = """
                ==================================
                ===========|| FILME || ===========
                Nome: %s
                Ano de lançamento: %d
                Duração: %d minutos
                Diretor: %s
                ==================================
                """.formatted(getNome(), getAnoDeLancamento(), getDuracaoEmMinutos(), getDiretor());
        System.out.println(ficha);
    }
}