package ufc.carta;

public class CartaFactory {

    public Carta criarCarta(TipoCarta tipoCarta, String descricao, double valor){
        if(tipoCarta == TipoCarta.SORTE){
            return new CartaSorte(TipoCarta.SORTE, descricao, valor);
        }
        else if(tipoCarta == TipoCarta.REVES){
            return new CartaReves(TipoCarta.REVES, descricao, valor);
        }
        else{
            return new CartaReves(TipoCarta.INICIO, descricao, valor);
        }
    }
}
