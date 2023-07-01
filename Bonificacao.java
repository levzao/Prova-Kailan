package Prova;

public enum Bonificacao {
    GERENTE(0.35),
    DIRETOR(0.45);

    //Def. Variavéis
    protected double valor;

    //Constructor
    private Bonificacao(double valor) {
        this.valor = valor;
    }

    //Get
    public static Bonificacao getGERENTE() {
        return GERENTE;
    }

    public static Bonificacao getDIRETOR() {
        return DIRETOR;
    }

}
