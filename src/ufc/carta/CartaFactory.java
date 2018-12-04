package ufc.carta;

public class CartaFactory {

    public Carta criarCarta(TipoCarta tipoCarta, String descricao, double valor){
        if(tipoCarta == TipoCarta.SORTE){
            return new CartaSorte(TipoCarta.SORTE.name(), descricao, valor);
        }else{
            return new CartaReves(TipoCarta.REVES.name(), descricao, valor);
        }
    }
}
