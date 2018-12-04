package ufc;

import ufc.carta.Carta;
import ufc.jogador.Jogador;

public class ControllerMonetiza implements IMonetiza {

    @Override
    public void atualizaDinheiro(Jogador jogador, Carta carta) {
        double dinheiro = jogador.getDinheiro();
        jogador.setDinheiro(dinheiro + carta.getValor());
    }
}
