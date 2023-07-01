package Prova;

import java.time.LocalDate;



public abstract class CargoDeConfianca extends Funcionario{
    //Def. Variavéis
    protected Bonificacao bonificacao;
    
    //Constructor

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
        this.bonificacao = bonificacao;
    }
    
    //Método Get e Set

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
}
