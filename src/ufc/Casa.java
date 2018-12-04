package ufc;


public class Casa {

    private TipoAcaoCasa tipoAcaoCasa;
    private int posicao;
    private boolean livre;

    public Casa(TipoAcaoCasa tipoAcaoCasa, int posicao) {
        this.tipoAcaoCasa = tipoAcaoCasa;
        this.posicao = posicao;
        this.livre = true;
    }

    public TipoAcaoCasa getTipoAcaoCasa() {
        return tipoAcaoCasa;
    }

    public int getPosicao() {
        return posicao;
    }

    public boolean isLivre() {
        return livre;
    }

    public void setLivre(boolean livre) {
        this.livre = livre;
    }

    //pode pegar carta
    //pode comprar algo
    //pode mover pra algum lugar
    //tipo de acao strategy algaworks

}
