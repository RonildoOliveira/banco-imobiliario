package ufc.jogador;

import java.util.ArrayList;

public class RepositorioPropriedades {

    private ArrayList<Propriedade> propriedades;

    public RepositorioPropriedades() {
        propriedades = new ArrayList<>();
    }

    public Propriedade getPropriedadeByPosition(int posicao){
        for (Propriedade p : propriedades) {
            if (p.getPosition() == posicao){
                return p;
            }
        }
        return null;
    }
}
