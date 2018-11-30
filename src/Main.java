import ufc.Jogador;
import ufc.JogadorObserver;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        JogadorObserver jogadorObserver = new JogadorObserver(jogador1);

        jogador1.setDinheiro(789);
    }
}
