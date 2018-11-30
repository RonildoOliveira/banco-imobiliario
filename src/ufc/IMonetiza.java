package ufc;

/**
 * Strategy
 */
public interface IMonetiza {

    public void atualizaDinheiro(Jogador jogador, Carta carta);
}

class MonetizaReves implements IMonetiza {

    @Override
    public void atualizaDinheiro(Jogador jogador, Carta carta) {
        double dinheiro = jogador.getDinheiro();
        jogador.setDinheiro(dinheiro - carta.getValor());
    }
}

class MonetizaSorte implements IMonetiza {

    @Override
    public void atualizaDinheiro(Jogador jogador, Carta carta) {
        double dinheiro = jogador.getDinheiro();
        jogador.setDinheiro(dinheiro + carta.getValor());
    }
}