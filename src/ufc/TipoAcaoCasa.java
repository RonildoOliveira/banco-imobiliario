package ufc;

import ufc.carta.Carta;
import ufc.jogador.Jogador;
import ufc.jogador.Propriedade;
import ufc.jogador.RepositorioPropriedades;

public enum TipoAcaoCasa {

    SORTE_REVES {
        @Override
        public void getAcao(Jogador jogador) {
            //Singleton sortereves
            System.out.println("Sorte Reves");
            //tira carta
            //executa instrucao da carta
            //devolve carta
        }
    },
    IMOVEL {
        @Override
        public void getAcao(Jogador jogador) {
            //se sim
            //se tiver livre
            RepositorioPropriedades repositorioPropriedades = new RepositorioPropriedades();
            Propriedade propriedade = repositorioPropriedades.getPropriedadeByPosition(jogador.getPosicao());
            jogador.getPropriedades().add(propriedade);
            System.out.println("Imovel");

            //se tiver ocupado

        }
    };

    public abstract void getAcao(Jogador jogador);
}
