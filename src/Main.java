import ufc.*;
import ufc.carta.Carta;
import ufc.carta.CartaSorte;
import ufc.jogador.Jogador;
import ufc.jogador.JogadorObserver;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        JogadorObserver jogadorObserver = new JogadorObserver(jogador1);

        Carta cartaSorte = new CartaSorte();
        cartaSorte.setNome("Sorte");
        cartaSorte.setValor(344);

        jogador1.setDinheiro(789);

        Monetiza monetiza = new Monetiza();
        monetiza.atualizaDinheiro(jogador1, cartaSorte);
    }
}
