package ufc;

import ufc.carta.Carta;
import ufc.jogador.Jogador;

public class Monetiza implements IMonetiza {

    @Override
    public void atualizaDinheiro(Jogador jogador, Carta carta) {
        double dinheiro = jogador.getDinheiro();
        jogador.setDinheiro(dinheiro + carta.getValor());
    }
}
