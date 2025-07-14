package Pacote;

import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Serie;
import br.com.alura.ScreenMatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avaliar(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avaliar(6);
        var filmeDoGabriel = new Filme("Vingadores Ultimato", 2019);
        filmeDoGabriel.avaliar(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoGabriel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao () > 2) {
                System.out.println("Classificação" + filme.getClassificacao());
            }
        }
    }
}
