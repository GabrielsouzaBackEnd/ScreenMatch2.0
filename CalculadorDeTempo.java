package br.com.alura.ScreenMatch.calculos;

import br.com.alura.ScreenMatch.modelos.Titulo;

public class CalculadorDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }


    public void inclui(Titulo t)
    {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
