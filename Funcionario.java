package Prova;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal {

    //Def. Variavéis
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Setor setor;
    protected Genero genero;
    protected double salario;
    protected LocalDate dataNascimento;

    //Constructor
    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.genero = genero;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    //Método Get and Set
    public String getNome() {
        return nome;
    }

    //getIdade
    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Método toString
    @Override
    public String toString() {
        return "\n ----- Dados do Funcionario----- "
                + "\n Nome: " + nome
                + "\n CPF: " + cpf
                + "\n RG: " + rg
                + "\n ----- Endereço ----- " + endereco
                + "\n Setor: " + setor.nome
                + "\n Gênero: " + genero.caractere + ", " + genero.texto
                + "\n Salário: " + salario
                + "\n Data de Nascimento: " + dataNascimento
                + "\n Idade Atual: " + getIdade();
    }

}
