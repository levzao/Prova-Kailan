package Prova;

public enum Setor {
    //Def. Constantes
    ENGENHARIA("Engenharia"),
    JURIDICO("Jurídico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");

    //Def. Variavéis
    protected String nome;

    //Constructor
    private Setor(String nome) {
        this.nome = nome;
    }

    //Método Get
    public static Setor getENGENHARIA() {
        return ENGENHARIA;
    }

    public static Setor getJURIDICO() {
        return JURIDICO;
    }

    public static Setor getRECURSOS_HUMANOS() {
        return RECURSOS_HUMANOS;
    }

    public static Setor getMARKETING() {
        return MARKETING;
    }

    public static Setor getOPERACOES() {
        return OPERACOES;
    }

}
