package ufc.jogador;

import ufc.IObserver;

public class JogadorObserver implements IObserver {

    private double dinheiro;

    private static int observerIDTracker = 0;
    private int observerID;
    private Jogador jogador;

    public JogadorObserver(Jogador jogador) {
        this.jogador = jogador;
        this.observerID = observerIDTracker ++;
        jogador.register(this);
    }

    @Override
    public void update(double dinheiro) {
        this.dinheiro = dinheiro;

        System.out.println(dinheiro);
    }

}
