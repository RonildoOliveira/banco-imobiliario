package ufc.carta;

public enum TipoCarta {

    SORTE("Sorte"), REVES("Reves"),
    INICIO("Reves"), ESCAPE("Sorte"), PRISAO("Prisão");

    private String nomeTipoCarta;

    TipoCarta(String nomeTipoCarta) {
        this.nomeTipoCarta = nomeTipoCarta;
    }
}
