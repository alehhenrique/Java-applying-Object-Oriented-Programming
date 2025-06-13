package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int totalTempo;

    public int getTotalTempo() {
        return totalTempo;
    }
    public void incluirTempo (Titulo titulo){
        totalTempo += titulo.getDuracaoEmMinutos();
    }
}
