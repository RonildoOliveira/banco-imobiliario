package ufc;

public class CartaFactory {

    public Carta criarCarta(TipoCarta tipoCarta){
        if(tipoCarta == TipoCarta.SORTE){
            return new Sorte();
        }else{
            return new Reves();
        }
    }
}
