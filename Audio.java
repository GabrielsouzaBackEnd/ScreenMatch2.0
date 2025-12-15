package br.com.alura.ScreenMatch.Desafio;

import br.com.alura.ScreenMatch.calculos.Classificacao;

public class Audio implements Classificacao {

    private String title;
    private int duration;
    private int totalPlays;
    private int likes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    // mantém o comportamento original (incrementa, ignora parâmetro)
    public void setTotalPlays(int totalPlays) {
        this.totalPlays++;
    }

    public int getLikes() {
        return likes;
    }

    // mantém o comportamento original (incrementa, ignora parâmetro)
    public void setLikes(int likes) {
        this.likes++;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }

    public void play() {
        this.totalPlays++;
    }

    public void like() {
        this.likes++;
    }
}
