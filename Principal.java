import br.com.alura.ScreenMatch.calculos.CalculadorDeTempo;
import br.com.alura.ScreenMatch.calculos.FiltroRecomendacao;
import br.com.alura.ScreenMatch.modelos.Episodio;
import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        //meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        System.out.println("Duração do Filme : " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar( 10);
        meuFilme.avaliar(7);
        meuFilme.avaliar(5);
        System.out.println("Total de Avalições " + meuFilme.getTotalDeAvaliacoes());

        Filme outroFilme = new Filme("Avatar",2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 200 );
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutoPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadorDeTempo calculadora = new CalculadorDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.Filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.Filtra(episodio);

        Filme filmeDoGabriel = new Filme("Vingadore",2019);
        //filmeDoGabriel.setNome("Vingadores Ultimato");
        filmeDoGabriel.setDuracaoEmMinutos(181);
        //filmeDoGabriel.setAnoDeLancamento(2019);
        filmeDoGabriel.avaliar(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDoGabriel);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);
        System.out.println("Tamanho da Lista: " + listaDeFilme.size());
        System.out.println("Primeiro Filme: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme" + listaDeFilme.get(0).toString());

        filmeDoGabriel.toString();
    }
}
