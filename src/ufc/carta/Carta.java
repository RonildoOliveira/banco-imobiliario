package ufc.carta;

public abstract class Carta {

    private String descricao;
    private double valor;
    private TipoCarta tipoCarta;

    public Carta(TipoCarta tipoCarta, String descricao, double valor) {
        this.tipoCarta = tipoCarta;
        this.descricao = descricao;
        this.valor = valor;
    }

    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
