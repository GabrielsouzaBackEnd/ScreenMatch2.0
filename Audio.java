package br.com.alura.ScreenMatch.Desafio;

import br.com.alura.ScreenMatch.calculos.Classificacao;

public class Audio  implements Classificacao {
    private String Titulo;
    private int Duracao;
    private int totalDeReproducoes;
    private int curtida;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getDuracao() {
        return Duracao;
    }

    public void setDuracao(int duracao) {
        Duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes++;
    }

    public int getCurtida() {
        return curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida++;

    }

    @Override
    public int getClassificacao() {
        return 0;
    }
    public void reproduzir() {
        this.totalDeReproducoes++;
    }
    public void curtir() {
        this.curtida++;
    }


}
