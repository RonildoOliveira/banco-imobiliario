package ufc;

import ufc.util.CircularArrayList;

public class Casas {

    private static CircularArrayList<Casa> casas;
    private static Casas ourInstance = new Casas();

    public static Casas getInstance() {
        return ourInstance;
    }

    private Casas() {
        casas = new CircularArrayList<>();
    }

    private void carregaTabuleiro(){
        casas.add(new Casa(TipoAcaoCasa.SORTE_REVES, 2));
    }

    public static CircularArrayList<Casa> getCasas() {
        return casas;
    }

    public static Casa getCasaByPosition(int position) {
        for (Casa c: casas) {
            if(c.getPosicao() == position){
                return  c;
            }
        }
        return null;
    }
}
