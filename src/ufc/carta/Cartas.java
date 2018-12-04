package ufc.carta;

import ufc.TipoAcaoCasa;

import java.util.ArrayList;

public class Cartas {

    private static ArrayList<Carta> cartas;
    private static Cartas ourInstance = new Cartas();
    private static CartaFactory cartaFactory;

    public static Cartas getInstance() {
        return ourInstance;
    }

    private Cartas() {
        cartas = new ArrayList<>();
        cartaFactory = new CartaFactory();
        criaTodasCartasSorte();
    }

    private void criaTodasCartasSorte(){
        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "A prefeitura mandou abrir uma nova avenida, " +
                        "para o que desapropriou vários prédios. Em consequência seu terreno valorizou.", 25));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Houve um assalto à sua loja, mas você estava segurado.",
                150));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Você foi promovido a diretor da sua empresa.",
                150));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Um amigo tinha lhe pedido um empréstimo e se esqueceu de devolver. Ele acaba de se lembrar.",
                80));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Você saiu de férias e se hospedou na casa de um amigo. Você economizou o hotel.",
                45));

        //MOVIMENTO
        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Avance até o ponto de partida e...",
                200));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Você trocou seu carro usado com um amigo e ainda saiu lucrando.",
                50));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "O seu cachorro policial tirou o 1º prêmio na exposição do Kernel Club.",
                100));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Você jogou na Loteria Esportiva com um grupo de amigos. Ganharam!",
                20));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Inesperadamente você recebeu uma herança que já estava esquecida.",
                100));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Você apostou com os parceiros deste jogo e ganhou.",
                50));

        //MOVIMENTO
        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Saída livre da prisão, (conserve este cartão para quando lhe for preciso ou negocie-o em qualquer ocasião, por preço a combinar).",
                0));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Você está com sorte. Suas ações na Bolsa de Valores estão em alta.",
                200));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Você acaba de receber uma parcela do seu 13º Salário.",
                50));

        cartas.add(cartaFactory.criarCarta(TipoCarta.SORTE,
                "Você tirou o primeiro lugar no Torneio de Tênis do seu clube. Parabéns!",
                100));
    }

    public static ArrayList<Carta> getCartas() {
        return cartas;
    }
}
