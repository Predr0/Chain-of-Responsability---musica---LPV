package org.example;

public class PedidoPlay {
    private boolean logado;
    private boolean premium;
    private boolean permiteExplicito;
    private boolean musicaExplicita;

    public PedidoPlay(boolean logado, boolean premium, boolean permiteExplicito, boolean musicaExplicita) {
        this.logado = logado;
        this.premium = premium;
        this.permiteExplicito = permiteExplicito;
        this.musicaExplicita = musicaExplicita;
    }

    public boolean isLogado() { return logado; }
    public boolean isPremium() { return premium; }
    public boolean isPermiteExplicito() { return permiteExplicito; }
    public boolean isMusicaExplicita() { return musicaExplicita; }
}