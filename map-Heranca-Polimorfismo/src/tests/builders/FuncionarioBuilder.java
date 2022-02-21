package tests.builders;

import java.util.UUID;

import main.entidades.Funcionario;

public class FuncionarioBuilder {
    private Funcionario funcionario;

    public static FuncionarioBuilder mockFuncionario() {
        FuncionarioBuilder builder = new FuncionarioBuilder();
        builder.funcionario = new Funcionario("Funcionario 1");
        builder.funcionario.setId(UUID.randomUUID());

        return builder;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }
}
