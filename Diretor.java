package Prova;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao {

    //Def. Variavéis
    private double PREMIO = 0.5;

    //Constructor
    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return "\n Cargo Diretor" + super.toString()
                + "\n Prêmio: " + PREMIO;
    }

    //Métodos Abstratos
    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println(" Pessoa Admitida!!!");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |");

        System.out.println(funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println(" Funcionário Demitido!!!");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |");

        System.out.println(funcionario);
    }

}
