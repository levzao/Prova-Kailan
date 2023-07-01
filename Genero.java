package Prova;


public enum Genero {
    //Def. Constantes
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
   
    //Def. Variavéis
    protected char caractere;
    protected String texto;
    
    //Constructor

    private Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }
    
    //Método Get

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }
    
}
