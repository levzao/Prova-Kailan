package Prova;

import java.time.LocalDate;

public class Motorista extends Funcionario {

    //Def. Variavéis
    private String carteiraDeHabilitacao;

    //Constructor
    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    //Método Get e Set
    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    //Método toString
    @Override
    public String toString() {
        return " Funcionário Motorista"
                + super.toString()
                + "\n Carteira de Habilitação: "
                + carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
