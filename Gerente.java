package Prova;

import java.time.LocalDate;


public class Gerente extends CargoDeConfianca {
    //Constructor
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }

    @Override
    public String toString() {
        return "\n Cargo Gerente" + 
                super.toString()  ;
    }
    //toString

    @Override
    public double getSalarioFinal() {
        return getSalarioFinal();
    }
    
    
}
