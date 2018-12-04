package ufc;

import ufc.carta.Carta;
import ufc.carta.Cartas;
import ufc.jogador.Jogador;
import ufc.jogador.Propriedade;
import ufc.jogador.RepositorioPropriedades;

import java.util.Random;

public enum TipoAcaoCasa {

    SORTE_REVES {
        @Override
        public void getAcao(Jogador jogador) {
            System.out.println("Sorte Reves");

            //Singleton sortereves
            Cartas cartasInstance = Cartas.getInstance();

            //tira carta
            int index = new Random().nextInt(cartasInstance.getCartas().size());
            Carta carta = cartasInstance.getCartas().get(index);
            System.out.println(carta.getDescricao());

            //executa instrucao da carta
            ControllerMonetiza controllerMonetiza = new ControllerMonetiza();
            controllerMonetiza.atualizaDinheiro(jogador, carta);

            atualizaPosicaoJogador(carta, jogador);
        }
    },
    IMOVEL {
        @Override
        public void getAcao(Jogador jogador) {
            //deseja adquirir
            //se sim
            Casas getInstance = Casas.getInstance();
            getInstance.getCasas();

            //se tiver livre
            if(getInstance.getCasaByPosition(jogador.getPosicao()).isLivre()){
                RepositorioPropriedades repositorioPropriedades = new RepositorioPropriedades();
                Propriedade propriedade = repositorioPropriedades.getPropriedadeByPosition(jogador.getPosicao());
                jogador.getPropriedades().add(propriedade);
                System.out.println("Imovel");
            }
            //se tiver ocupado
            else{

            }
        }
    };

    public abstract void getAcao(Jogador jogador);

    public void atualizaPosicaoJogador(Carta carta, Jogador jogador){
        switch (carta.getTipoCarta()){
            case INICIO:
                jogador.setPosicao(0);
                break;
            case PRISAO:
                jogador.setPosicao(10);
                break;
        }
    }
}
