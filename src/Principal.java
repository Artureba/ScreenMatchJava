import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        //Cria um novo objeto do tipo Filme chamado meuFilme
        Filme meuFilme = new Filme();

        //Popula os atributos do objeto 'meuFilme' com dados
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        //Imprime o que foi populado
        meuFilme.exibeFichaTecnica();

        //Adiciona 3 notas para o 'meuFilme'
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //Imprime as informações adicionadas a cima e a media das notas
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar Lost: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2018);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}