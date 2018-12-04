import jplay.Window;
import ufc.*;
import ufc.carta.Carta;
import ufc.jogador.Jogador;
import ufc.jogador.JogadorObserver;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        JogadorObserver jogadorObserver = new JogadorObserver(jogador1);

        jogador1.setDinheiro(789);

        /**
        Carta cartaSorte = new CartaSorte();
        cartaSorte.setNome("Sorte");
        cartaSorte.setValor(344);

        ControllerMonetiza monetiza = new ControllerMonetiza();
        monetiza.atualizaDinheiro(jogador1, cartaSorte);
        **/

        Casa casa = new Casa(TipoAcaoCasa.SORTE_REVES, 2);
        casa.getTipoAcaoCasa().getAcao(jogador1);

        //Window window = new Window(800, 600);

    }
}
