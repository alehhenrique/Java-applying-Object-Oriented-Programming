import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("The Matrix");
        favorito.setIncluidoNoPlano(true);
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);

        favorito.exibeFichaTecnica();
        favorito.avalia(5);
        favorito.avalia(2);
        favorito.avalia(1);

        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações do filme: " + favorito.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluirTempo(favorito);
        calculadora.incluirTempo(serie);

        System.out.println("Tempo total: " + calculadora.getTotalTempo());

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.settotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(favorito);
        filtro.filtrar(primeiro);
    }
}