package br.com.alura.ScreenMatch.Desafio;

public class Podcast extends Audio
{
    private String Host;
    private String Decricao;

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getDecricao() {
        return Decricao;
    }

    public void setDecricao(String decricao) {
        Decricao = decricao;
    }
}
