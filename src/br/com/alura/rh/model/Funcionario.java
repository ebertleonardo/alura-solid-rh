package br.com.alura.rh.model;

public class Funcionario {

    private String nome;

    private String cpf;

    private Cargo cargo;

    private double salario;

    public void reajustarSalario(double aumento) {
        double percentualReajuste = (aumento / this.salario) * 100;

        if (percentualReajuste > 40) {
            throw new IllegalArgumentException("O percentual de reajuste deve ser inferior a 40%!");
        }

        this.salario += aumento;
    }
}
