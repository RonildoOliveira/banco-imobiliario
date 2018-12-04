package ufc.carta;

public class CartaFactory {

    public Carta criarCarta(TipoCarta tipoCarta){
        if(tipoCarta == TipoCarta.SORTE){
            return new CartaSorte();
        }else{
            return new CartaReves();
        }
    }
}
