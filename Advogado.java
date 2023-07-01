package Prova;

import java.time.LocalDate;

public class Advogado extends Funcionario {

    //Def. Variavéis
    private String oab;

    //Constructor
    public Advogado(String oab, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
        this.oab = oab;
    }
    //Método Get and Set

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    //Método toString

    @Override
    public String toString() {
        return "\n Funcionário Advogado"
                + super.toString()
                + "\n OAB: " + oab;
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
