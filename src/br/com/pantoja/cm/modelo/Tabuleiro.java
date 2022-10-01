package br.com.pantoja.cm.modelo;

public class Tabuleiro {
    private final int linhas;
    private final int colunas;
    private final int minas;

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
    }
}
