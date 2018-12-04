package ufc;

import ufc.carta.Carta;
import ufc.jogador.Jogador;

/**
 * Strategy
 */
public interface IMonetiza {

    public void atualizaDinheiro(Jogador jogador, Carta carta);
}
