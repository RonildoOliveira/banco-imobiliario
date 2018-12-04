package ufc;


import ufc.carta.Carta;

public class Casa {

    private TipoAcaoCasa tipoAcaoCasa;
    private int posicao;
    private boolean ocupada;

    public Casa(TipoAcaoCasa tipoAcaoCasa, int posicao) {
        this.tipoAcaoCasa = tipoAcaoCasa;
        this.posicao = posicao;
        this.ocupada = false;
    }

    public TipoAcaoCasa getTipoAcaoCasa() {
        return tipoAcaoCasa;
    }

    public int getPosicao() {
        return posicao;
    }

    //pode pegar carta
    //pode comprar algo
    //pode mover pra algum lugar
    //tipo de acao strategy algaworks

}
