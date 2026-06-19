package Alura.Listas_e_colecao_de_dados.Aula_2.Screen_Match.Pacotes.Modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    // Construtor
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Getters/Setters
    public int getTemporadas() 
    {
        return temporadas;
    }
    
    public int getEpisodiosPorTemporada() 
    {
        return episodiosPorTemporada;
    }
    
    public boolean isAtiva() {
        return ativa;
    }
    
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    // Sobrescreveu sobre o getDuracaoEmMinutos da classe Mae (Titulo)
    @Override
    public int getDuracaoEmMinutos()
    {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public void setAtiva(boolean ativa) 
    {
        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada)
    {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setTemporadas(int temporadas) 
    {
        this.temporadas = temporadas;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) 
    {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // Método
    @Override
    public void exibeFichaTecnica()
    {
        String ficha = """
                ==================================
                ===========|| Série || ===========
                Nome da série: %s
                Ano de lançamento: %d
                Duração de cada episódio: %d minutos
                Temporadas: %d
                Episódios: %d
                ==================================
                """.formatted(getNome(), getAnoDeLancamento(), getMinutosPorEpisodio(), getTemporadas(), getEpisodiosPorTemporada());
        System.out.println(ficha);
    }
}
