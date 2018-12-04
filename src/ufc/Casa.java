package ufc;

//Vulgo Posicao
public class Casa {

    private TipoAcaoCasa tipoAcaoCasa;
    private int posicao;

    public Casa(TipoAcaoCasa tipoAcaoCasa, int posicao) {
        this.tipoAcaoCasa = tipoAcaoCasa;
        this.posicao = posicao;
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
