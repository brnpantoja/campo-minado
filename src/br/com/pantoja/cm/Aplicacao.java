package br.com.pantoja.cm;

import br.com.pantoja.cm.modelo.Tabuleiro;
import br.com.pantoja.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        new TabuleiroConsole(tabuleiro);

    }
}
