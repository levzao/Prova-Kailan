package Prova;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        //Exibindo Dados na Tela
        Motorista motorista = new Motorista("3144.1414", "Sabrina Veloso", "713.913.314-13", "34541.7251", new Endereco("Rua Conselheiro Alves", "31", "Prédio", "1421-134", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, Genero.FEMININO, 1324.99, LocalDate.of(2003, Month.JUNE, 15));
        Advogado advogado = new Advogado("13251.8914", "Kailan Pimentel", "412.144.512.56", "09101.2521.", new Endereco("Avenida São Paulo", "42", "Casa", "4124-241", "Salvador", UnidadeFederativa.BAHIA), Setor.JURIDICO, Genero.MASCULINO, 15000.00, LocalDate.of(2004, Month.SEPTEMBER, 16));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Juan Paixão", "341.625.856-18", "19041.5622", new Endereco("Rua Dendezeiros", "134", "Prédio", "1401-992", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 8000.000, LocalDate.of(1998, Month.MARCH, 12));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Diogo Silva", "414.010.631.21", "13412.1442", new Endereco("Avenida Magalhães Neto", "632", "Casa", "4390-000", "Candeias", UnidadeFederativa.BAHIA), Setor.MARKETING, Genero.MASCULINO, 25000.00, LocalDate.of(1949, Month.JANUARY, 1));

        diretor.admitir(motorista);
        System.out.println("");
        diretor.admitir(diretor);

    }
}
