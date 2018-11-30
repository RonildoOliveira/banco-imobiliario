package ufc;

public class JogadorObserver implements ufc.Observer {

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
